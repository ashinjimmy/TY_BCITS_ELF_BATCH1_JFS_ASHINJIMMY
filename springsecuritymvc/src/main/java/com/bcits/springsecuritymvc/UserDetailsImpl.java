package com.bcits.springsecuritymvc;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.bcits.springsecuritymvc.beans.EmpInfoBean;

import lombok.Data;

@Data
@Component
public class UserDetailsImpl implements UserDetails {

	private EmpInfoBean empInfoBean;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(empInfoBean.getRole());
		return Arrays.asList(authority);
	}

	@Override
	public String getPassword() {
		try {
			return empInfoBean.getPassword();
		} catch (Exception e) {
			System.out.println("im here in try and catch");
			return null;
		}

	}

	@Override
	public String getUsername() {
		return empInfoBean.getEmpId() + "";
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;

	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
