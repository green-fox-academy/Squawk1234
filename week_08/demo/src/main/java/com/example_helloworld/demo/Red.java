package com.example_helloworld.demo;

import org.springframework.stereotype.Service;

@Service
public class Red implements MyColour {
    @Override
    public void printColor() {
        System.out.println("It is red in color");
    }
}
