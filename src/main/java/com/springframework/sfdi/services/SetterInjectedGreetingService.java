package com.springframework.sfdi.services;

import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
