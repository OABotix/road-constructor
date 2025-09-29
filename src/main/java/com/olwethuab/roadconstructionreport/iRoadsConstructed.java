/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.olwethuab.roadconstructionreport;

/**
 *
 * @author oabhi
 * This is like a contract that says:
 * "Any class that signs this contract MUST be able to:
 * 1. Tell us the city name
 * 2. Tell us how many roads were built"
 */
public interface iRoadsConstructed {
    String getCity();                    // Must be able to return city name
    int getTotalRoadsConstructed();      // Must be able to return road count
}