package com.spring.demo.model;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by pulkit on 17/8/16.
 */
public class GrantAuthorityImpl implements GrantedAuthority {

    String authority;

    @Override
    public String getAuthority() {
        return authority;
    }
}
