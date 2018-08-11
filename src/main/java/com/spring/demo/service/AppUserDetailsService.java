package com.spring.demo.service;


import com.spring.demo.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        System.out.println("Load User by username");
        System.out.println(username);

        UserDetails userDetails = new User("live-test", "password123");
        System.out.println(userDetails);
        System.out.println(userDetails.getUsername());

        if(!userDetails.getUsername().equals(username)){
            System.out.println("inside if");
            throw new UsernameNotFoundException("User does not exists");
        }
        return userDetails;
    }
}
