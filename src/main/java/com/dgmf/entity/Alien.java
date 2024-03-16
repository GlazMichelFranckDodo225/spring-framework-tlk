package com.dgmf.entity;

import org.springframework.stereotype.Component;

// Alien Object Creation and Management Delegated to
// the Spring Framework with the @Component Annotation
// on Top of Alien Class
@Component
public class Alien {
    public void code() {
        System.out.println("I'm Coding ...");
    }
}
