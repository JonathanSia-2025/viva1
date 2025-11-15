/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva1;

import java.util.Scanner;

/**
 *
 * @author MelodyCloud
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid = true;
        
//        while (valid){
            
        
            int n_inqueries = sc.nextInt();
            int [] height = new int [n_inqueries];
            String [] style = new String [n_inqueries];
            if (((n_inqueries) < 1) || (n_inqueries > 50)){
                System.out.println("Number of inquiries is out of range(1-50)");
                valid = false;
            }
            for (int i = 0; i < n_inqueries; i++){
                height[i] = sc.nextInt();
                if ((height[i] < 1 ) || (height[i] > 9)){
                    System.out.println("Height is out of range(1-9)");
                    valid = false;
                }
                style[i] = sc.next();
//                if (!((style[i].equals("A") ) || (style[i].equals("P")))){
//                    System.out.println("Height is out of range(1-9)");
//                    valid = false;
//                }
                
            }
            
        while (valid){    
            for (int i = 0; i < n_inqueries; i++){
                int h = height[i];
                String t = style[i];
                switch (t) {
                    case "A" -> {
                        
//                      print h rows
                        for (int row = 1; row<=h; row++){
                            
//                          rows from 1 to h containing the digit rows repeated col times.
                            for (int col = 1; col<=row; col++){
                                System.out.print(row);
                            }
                            System.out.println();
                        }
                    }
                    case "P" -> {
                        for (int row = 1; row <= h; row++){
                            
//                          part 1: leading spaces
                            for (int k=0; k<(h-row); k++){
                                System.out.print(" ");
                            }
                            
//                          part 2: numbers ascending from 1 up to nth_rows
                            for (int col = 1; col <= row; col++){
                                System.out.print(col);
                            }
                            
//                          part 3: numbers descening from nth_rows - 1 back down to 1
                            for (int col_reverse = (row - 1); col_reverse > 0; col_reverse--){
                                System.out.print(col_reverse);
                            }
                            System.out.println();
                        }
                    }
                    default -> {
                        System.out.print("Enter A and P only for Angle and Pyramid pattern respectively.");
                        valid = false;
                    }
                }
                
            } 
        }
    }
}
