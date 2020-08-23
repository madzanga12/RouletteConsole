/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playsafe;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class KtoM {
    
    static double kmToml(double km) 
    { 
        return 0.621 * km; 
    } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter kilometer: ");
        
        Scanner sc = new Scanner(System.in);
        double km = (double) sc.nextDouble();        
        
        System.out.println("Miles: " + kmToml(km)+"ML");
    }
    
}
