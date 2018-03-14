package com.wuhenjian.aurora.cms.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2018/3/14 13:40
 */
@Component
public class UserShiroRealm extends AuthorizingRealm {

	@Resource(name = "userCredentialsMatcher")
	private UserCredentialsMatcher userCredentialsMatcher;

	public UserShiroRealm() {
		super.setCredentialsMatcher(this.userCredentialsMatcher);
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

		return null;
	}
}
