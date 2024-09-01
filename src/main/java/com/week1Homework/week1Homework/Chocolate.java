package com.week1Homework.week1Homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "flavour.env", havingValue = "chocolate")
public class Chocolate implements Frosting, Syrup {

    @Override
    public void getSyrupType() {
        System.out.println("Getting Chocolate Syrup");
    }

    @Override
    public void getFrostingType() {
        System.out.println("Getting Chocolate Frosting");
    }

}
