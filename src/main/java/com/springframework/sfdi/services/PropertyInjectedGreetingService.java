package com.springframework.sfdi.services;


import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
