package com.wuhenjian.aurora.cms.shiro;

import com.wuhenjian.aurora.consumer.service.SysGroupService;
import com.wuhenjian.aurora.consumer.service.SysMenuService;
import com.wuhenjian.aurora.consumer.service.SysUserService;
import com.wuhenjian.aurora.utils.entity.dao.SysGroup;
import com.wuhenjian.aurora.utils.entity.dao.SysMenu;
import com.wuhenjian.aurora.utils.entity.dao.SysUser;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/3/14 13:40
 */
public class UserShiroRealm extends AuthorizingRealm {

	@Autowired
	private SysUserService sysUserService;

	@Autowired
	private SysGroupService sysGroupService;

	@Autowired
	private SysMenuService sysMenuService;

	/**
	 * 获取权限
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		SysUser sysUser = (SysUser) principals.getPrimaryPrincipal();// 从认证信息处传过来的用户数据
		SysGroup sysGroup;// 用户组
		List<SysMenu> sysMenus;// 用户权限
		try {
			sysGroup = sysGroupService.selectBySuId(sysUser.getSuId());
			sysMenus = sysMenuService.selectBySuId(sysUser.getSuId());
		} catch (BusinessException e) {
			// 返回null将会导致用户访问任何被拦截的请求时都会自动跳转到unauthorizedUrl指定的地址
			return null;
		}
		simpleAuthorizationInfo.addRole(sysGroup.getGtype());// 保存用户角色
		for (SysMenu sm : sysMenus) {
			simpleAuthorizationInfo.addStringPermission(sm.getPermission());// 保存用户权限
		}
		return simpleAuthorizationInfo;
	}

	/**
	 * 认证身份信息
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;// 用户输入的用户名
		String uname = usernamePasswordToken.getUsername();
		SysUser sysUser;
		try {
			sysUser = sysUserService.selectByUname(uname);
		} catch (BusinessException e) {
			throw new AuthenticationException();
		}
		if (sysUser == null) {// 未找到当前账号
			throw new UnknownAccountException();
		}
		if (sysUser.getUstatus() != 1) {// 非正常状态
			throw new LockedAccountException();
		}
		// 将账号、密码、盐值交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配
		return new SimpleAuthenticationInfo(
				sysUser,// 用户信息
				sysUser.getUpassword(),// 密码
				ByteSource.Util.bytes(sysUser.getSalt()),// 盐值
				this.getName()// 对象名称
		);
	}
}
