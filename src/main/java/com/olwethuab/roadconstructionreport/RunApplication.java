/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.olwethuab.roadconstructionreport;

import java.util.Scanner;

/**
 *
 * @author oabhi
 */
public class RunApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for city name
        System.out.print("Enter the city for road construction: ");
        String city = scanner.nextLine();  // Read whatever the user types
        
        // Ask for number of roads
        System.out.print("Enter the total road construction for " + city + ": ");
        int totalRoads = scanner.nextInt();  // Read a number from the user
        
        // We're done with the scanner, so let it go
        scanner.close();
        
        // Create a RoadConstructionReport worker and give it the information
        RoadConstructionReport report = new RoadConstructionReport(city, totalRoads);
        
        // Tell the report worker to print the report
        report.printRoadsConstructedReport();
    }
}
