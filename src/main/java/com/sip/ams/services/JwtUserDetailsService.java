package com.sip.ams.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		/*Claims claims = Jwts.parser()
			    .setSigningKey(secretKey)
			    .parseClaimsJws(token)
			    .getBody();*/
		if ("med".equals(username)) {
			//List<GrantedAuthority> authorities = AuthorityUtils.commaSeparatedStringToAuthorityList((String) claims.get(AUTHORITIES_KEY));
			//Collection<GrantedAuthority> authorities = new ArrayList<>();
			return new User("med", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",new ArrayList<>());
			} 
		 else {
			throw new UsernameNotFoundException("User not found with username: " + username);
			}
	}

}
