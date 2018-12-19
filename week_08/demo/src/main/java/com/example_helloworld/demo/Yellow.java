package com.example_helloworld.demo;

import org.springframework.stereotype.Service;

@Service
public class Yellow implements MyColour {
    @Override
    public void printColor() {
        System.out.println("This is yellow");
    }
}
