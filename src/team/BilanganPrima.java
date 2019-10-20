/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nabiela Sarah
 */
public class BilanganPrima {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static ArrayList<Integer> obj = new ArrayList<>();
    static int jumlah=0;
    public static void main(String[] args) {
        while (true){
            System.out.println("Menu hari ini");
            System.out.println("1. Penjumlahan Bilangan Prima");
            System.out.println("2. Jumlah Bilangan Prima");
            System.out.println("3. Exit");
            System.out.print("Masukan Pilihan Anda : ");
            
            int pilih = input.nextInt();
             switch(pilih) {
                case 1:
                    firstMenu();
                    break;
                case 2:
                    secondMenu();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Anda Tidak Terdaftar!");
            }
        }
    }
    
    private static void print(){
        for(int i=0;i<obj.size();i++){
            System.out.print(obj.get(i));
            System.out.print("\t");
            jumlah = jumlah + obj.get(i);
        }
    }
    private static void firstMenu(){
        System.out.print("Masukan Bilangan 1 : ");
        int angka = input.nextInt();
        System.out.print("Masukan Bilangan 2 : ");
        int angka2 = input.nextInt();
        getPrime(angka, angka2);
        print();
        System.out.println();
        System.out.println("Penjumlahan Bilangan Prima = "+jumlah);
    }
    
    private static void secondMenu(){
        print();
        System.out.println();
        System.out.println("Penjumlahan Bilangan Prima = "+obj.size());
    }
    private static boolean isPrime(int value){
        boolean isPrime = true;
        for(int j =2;j<=value;j++){
            if(value%j==0 && j!=value){
                isPrime = false;
            }
        }
        return isPrime;
    }
    
    private static void getPrime(int angka, int angka2){
        for(int i=angka;i <= angka2;i++){
            boolean pr = isPrime(i);
            if(pr){
                if(i!=1){
                    obj.add(i);
                }
            }
        }
    }
    
}
