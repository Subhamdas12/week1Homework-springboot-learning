package com.week1Homework.week1Homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "flavour.env", havingValue = "strawberry")
public class Strawberry implements Frosting, Syrup {
    @Override
    public void getSyrupType() {
        System.out.println("Getting Strawberry Syrup");
    }

    @Override
    public void getFrostingType() {
        System.out.println("Getting Strawberry Frosting");
    }
}
