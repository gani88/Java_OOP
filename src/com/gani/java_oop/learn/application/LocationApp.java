package com.gani.java_oop.learn.application;

import com.gani.java_oop.Abstract.City;

public class LocationApp {

    public static void main(String[] args) {

//        Location location = new Location(); this line of code is error because abstrack

        City city = new City();
        city.name = "Semarang";

        System.out.println(city.name);
    }
}
