/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */

public class L4Q5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        
        int sum1=0;
        int sum2=0;
        int playerOne;
        int playerTwo;
        do{
            roll:{
            playerOne = random.nextInt(1,7);
            sum1 += playerOne;
            if(playerOne ==6){
                break roll;
                }
            }
            if(sum1>=100)
                break;
            roll2:{
                
            playerTwo = random.nextInt(6)+1;
            sum2 += playerTwo;
            if(playerTwo == 6){
                break roll2;
                }
            }
            if(sum2>=100)
                break;
            
        }while(sum1<100 && sum2<100);
        
        System.out.println("Player one score is " + sum1);
        System.out.println("Player two score is "+ sum2);
    }
}
