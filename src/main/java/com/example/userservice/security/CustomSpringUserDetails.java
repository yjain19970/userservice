package com.example.userservice.security;

import com.example.userservice.model.Role;
import com.example.userservice.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomSpringUserDetails implements UserDetails {
    private User user;

    public CustomSpringUserDetails(User user) {
        this.user = user;
    }

    /**
     * USer: [R1,R2,R3]
     *
     * R1....R9 CustomSpringGrantedAuthority
     * @return
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<CustomSpringGrantedAuthority> authorities = new ArrayList<>();
        for(Role currentRole : user.getRoles()){
            authorities.add(
                    new CustomSpringGrantedAuthority(currentRole));
        }
        // Authorization
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
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
