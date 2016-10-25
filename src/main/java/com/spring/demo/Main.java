package com.spring.demo;

import org.springframework.boot.*;
        import org.springframework.boot.autoconfigure.*;
        import org.springframework.stereotype.*;
        import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@Controller
@SpringBootApplication
@RolesAllowed("ROLE_ANONYMOUS")
public class Main {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}