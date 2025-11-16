/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

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
            
        
        int n_inquiries = sc.nextInt();
        if ((n_inquiries < 1) || (n_inquiries > 50)){
               System.out.println("number of inquiries is out of range(1-50)");
               valid = false;
            }
        int [] height = new int [n_inquiries];
        String [] style = new String [n_inquiries];
        for (int i = 0; i < n_inquiries; i++){
            height[i] = sc.nextInt();

            if ((height[i] < 0 ) || (height[i] > 9 )){
                System.out.println("height is out of range(1-9");
                valid = false;
                }
            style[i] = sc.next();
            }
            
        if (valid){
                
            
            for (int i = 0; i < n_inquiries; i++){
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
