/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva1;

import java.util.Scanner;

/**
 *
 * @author MelodyCloud
 */
public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] log = new String[n];
        String output = "";

        for (int i=0;i<n;i++){
            log[i] = sc.next();
        }
        for (int j=0;j<n;j++){
            String s = log[j];
            boolean valid_log = true;
            String waitlist = "";
            
            for (int k=0; k < s.length()-1;k++){
                char c1 = s.charAt(k);
                int ascii1 = c1;
                char c2 = s.charAt(k+1);
                int ascii2 = c2;
                        
//              violate rule A : first character starts with digit
//              2-9 in ascii
                if ((k==0) && (ascii1 >= 50) && (ascii1 <= 57)){
                    valid_log = false;
                }
                //              violate rule B : exist digit 1 or 0
                if ((ascii1 == 48) || (ascii1 == 49)){
                    valid_log = false;
                }
                
//                violate rule C: two adjacent digits are number
                if ((ascii1 >= 50) && (ascii1 <= 57) && (ascii2 >= 50) && (ascii2 <= 57)){
                    valid_log = false;
                }
                
                
                if (valid_log){
//                    c1 is a number, skip
                    if ((ascii1 >= 50) && (ascii1 <= 57)){
                        continue;
//                    c1 is digit and c2 is number, repeat c1 for c2 times
                    } else if ((ascii1 < 50) || (ascii1 > 57) && (ascii2 >= 50) && (ascii2 <= 57)){
                        waitlist += c1;

                        int x = ascii2 - 48;
//                      0 starts at 48 in ascii
                        for (int i=0; i<(x-1); i++){
                            waitlist += c1;
                        }
//                  two adjacent character, add c1 to output
                    } else {
                        waitlist += c1;
                    }
//                   last second digit and c2 is not a number, add c2 to output, if last digit is c1, cause OutOfIndex error by c2
                    if ((k==s.length()-2) && ((ascii2 < 50) || (ascii2 > 57))){
                        waitlist += c2;
                    }
//              any violation, return invalid and stop the for loop of the string
                } else {
                    waitlist = "";
                    output += "Invalid Log ";
                    break;
                }
            }
//            any string that is valid will more than 0 char
            if (waitlist.length()>0){
                output += waitlist.length();
            }
            output += " ";
        }
        
        System.out.println(output);
        
        
    }
}
