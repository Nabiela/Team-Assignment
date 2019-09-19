/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;

import java.util.Scanner;

/**
 *
 * @author Team
 */
public class Team {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
         System.out.print("Masukkan jumlah kilogram yang akan dikonversi = ");
            Scanner input = new Scanner(System.in); 
            double kg = input.nextInt ();
            double pon = kg*2;
            double ons = kg*10;
            double gram = kg*10000;
            System.out.println(kg + " kilogram sama dengan = " + pon + " pon " + ons + " ons "+ gram + " gram ");
    }
}
