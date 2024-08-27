package com.example.privatespring.configurations;

import com.example.privatespring.models.UserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserPrincipal implements UserDetails { //kế thừa lại UserDetails để lấy chi tiết user để trả về frontend

    private final String name;
    private final Collection<? extends GrantedAuthority> authorities; //GrantedAuthority sẽ nằm trong token có info về role của user

    public static UserPrincipal build(UserEntity user) {
        List<GrantedAuthority> authority = user.getRole().stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
        return new UserPrincipal(user.getFullName(), authority);
    }

    public UserPrincipal(String name, Collection<? extends GrantedAuthority> authorities) {
        this.name = name;
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }

}
