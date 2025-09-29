/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.olwethuab.roadconstructionreport;

/**
 *
 * @author oabhi
 * This is our main template for storing road construction information.
 * It's like a form with some sections already filled out.
 */
public abstract class RoadsConstructed implements iRoadsConstructed {
    // These are like empty boxes to store information
    private String city;                    // Box for city name
    private int totalRoadsConstructed;      // Box for road count
    
    /**
     * This is a CONSTRUCTOR - it's like a factory that creates new objects
     * When we create a new RoadsConstructed, we give it the city and road count
     */
    public RoadsConstructed(String city, int totalRoadsConstructed) {
        this.city = city;                              // Put city in the city box
        this.totalRoadsConstructed = totalRoadsConstructed;  // Put road count in road count box
    }
    
    /**
     * This method looks in the city box and tells us what's inside
     */
    @Override
    public String getCity() {
        return city;    // "Here's the city name from the box"
    }
    
    /**
     * This method looks in the roads box and tells us what's inside  
     */
    @Override
    public int getTotalRoadsConstructed() {
        return totalRoadsConstructed;  // "Here's the road count from the box"
    }
}