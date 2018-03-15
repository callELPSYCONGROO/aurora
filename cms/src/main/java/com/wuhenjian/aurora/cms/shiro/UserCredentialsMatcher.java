package com.wuhenjian.aurora.cms.shiro;

import com.wuhenjian.aurora.utils.security.Md5Util;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

/**
 * @author 無痕剑
 * @date 2018/3/14 16:59
 */
public class UserCredentialsMatcher extends SimpleCredentialsMatcher {

	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		UsernamePasswordToken utoken = (UsernamePasswordToken) token;// 用户输入
		String inPassword = new String(utoken.getPassword());
		SimpleAuthenticationInfo sysInfo = (SimpleAuthenticationInfo) info;// 数据库用户信息
		String dbPassword = (String) sysInfo.getCredentials();
		String salt = new String(sysInfo.getCredentialsSalt().getBytes());
		String inSaltPassword = Md5Util.encode(inPassword, salt);
		return super.equals(inSaltPassword, dbPassword);
	}
}
