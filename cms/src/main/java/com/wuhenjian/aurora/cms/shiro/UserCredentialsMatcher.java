package com.wuhenjian.aurora.cms.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.springframework.stereotype.Component;

/**
 * @author 無痕剑
 * @date 2018/3/14 16:59
 */
@Component
public class UserCredentialsMatcher extends SimpleCredentialsMatcher {

	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		UsernamePasswordToken utoken = (UsernamePasswordToken) token;
		String inPassword = new String(utoken.getPassword());
		String dbPassword = (String) info.getCredentials();
		return super.equals(inPassword, dbPassword);
	}
}
