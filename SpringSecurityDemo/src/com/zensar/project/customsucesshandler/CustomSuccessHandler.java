package com.zensar.project.customsucesshandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;


public class CustomSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	@Override
	protected void handle(HttpServletRequest request,HttpServletResponse response,Authentication authenticate) throws IOException{
		String targetUrl = determineTargetUrl(authenticate);
		if(response.isCommitted()){
			return;
		}
		redirectStrategy.sendRedirect(request, response, targetUrl);
	}

	private String determineTargetUrl(Authentication authenticate) {
		String url="";
		Collection<?extends GrantedAuthority> auth = authenticate.getAuthorities();
		List<String>roles=new ArrayList<String>();
		for(GrantedAuthority a:auth)
			roles.add(a.getAuthority());
		if(isDba(roles))
			url="/db";
		else if(isAdmin(roles))
			url="/admin";
		else if(isUser(roles))
			url="/";
		else
			url="/accessDenied";
		return url;
	}

	private boolean isUser(List<String> roles) {
		if(roles.contains("ROLE_USER"))
			return true;
		return false;
	}

	private boolean isAdmin(List<String> roles) {
		if(roles.contains("ROLE_ADMIN"))
			return true;
		return false;
	}

	private boolean isDba(List<String> roles) {
		if(roles.contains("ROLE_DBA"))
			return true;
		return false;
	}
	
}
