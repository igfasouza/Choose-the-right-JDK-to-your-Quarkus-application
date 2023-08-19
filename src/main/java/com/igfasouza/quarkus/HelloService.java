package com.igfasouza.quarkus;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {

    public String hello(){
        return "Hello Quarkus Club";
    }
}