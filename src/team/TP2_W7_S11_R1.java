/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TP2_W7_S11_R1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Masukkan Nama Anda = ");
        Scanner input1 = new Scanner(System.in); 
        String name = input1.next();
        System.out.print("Masukkan Tahun Lahir Anda = ");
        input1 = new Scanner(System.in);
        int year = input1.nextInt();
        int age = calculateAge(year);
        String clasification = getFilm(age);
        name = age < 13 ? "Adik "+name+",":name+", Anda";
        String add = "";
        add = age < 13 ? "hanya ":add;
        System.out.println(name+" berusia "+age+" tahun, "+add+"dapat menonton "
                + "film dengan klasifikasi "+clasification);
        
    }
    
    private static int calculateAge(int birthYear){
        int result = 0;
        Calendar calendar = new GregorianCalendar();
        int currentDate = calendar.get(Calendar.YEAR);
        result = Math.abs(currentDate - birthYear);
        return result;
    }
    
    private static String getFilm(int age){
        String klasifikasi = "SU";
        if(age >= 13 && age < 17){
            klasifikasi =klasifikasi +" dan 13+";
        }else if(age >= 17 && age < 21){
            klasifikasi =klasifikasi +", 13+ dan 17+";
        }else if (age>=21){
           klasifikasi =klasifikasi +", 13+, 17+ dan 21+";
        }
        return klasifikasi;
    }    
}