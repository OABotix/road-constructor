/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.olwethuab.roadconstructionreport;

/**
 *
 * @author oabhi
 * This is our specialist class that knows how to CREATE REPORTS
 * It gets all the road/city information from its parent class
 */
public class RoadConstructionReport extends RoadsConstructed {
    
    /**
     * Constructor - when we create a report, we need to tell it the city and roads
     * We use 'super' to send this information to the parent class
     */
    public RoadConstructionReport(String city, int totalRoadsConstructed) {
        super(city, totalRoadsConstructed);  // "Hey parent class, here's the city and roads info!"
    }
    
    /**
     * This is our special method that PRINTS the pretty report
     */
    public void printRoadsConstructedReport() {
        // Print a fancy header
        System.out.println("\nROAD CONSTRUCTION REPORT");
        System.out.println("*********************************************************************");
        
        // Get city name from parent class and print it
        System.out.println("CITY: " + getCity());
        
        // Get road count from parent class and print it  
        System.out.println("ROADS CONSTRUCTED: " + getTotalRoadsConstructed());
        
        // Print a fancy footer
        System.out.println("*********************************************************************");
    }
}