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
            
            int n_queries = sc.nextInt();
            int [] height = new int [n_queries];
            String [] type = new String [n_queries];
            
            for (int i = 0; i < n_queries; i++){
                height[i] = sc.nextInt();
                type[i] = sc.next();
            }
            
            for (int i = 0; i < n_queries; i++){
                int h = height[i];
                String t = type[i];
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
                    default -> System.out.print("Enter A and P only for Angle and Pyramid pattern respectively.");
                }
                
            }        
        }
    }
