/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg4;

import java.util.Random;

/**
 *
 * @author User
 */
public class L4Q8 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(1,101);
        System.out.println("Random number is "+num);
        int count=0;
        int primeCount=2;
        
        while(count < num){
            if(Prime(primeCount)){
                System.out.println(primeCount);
                count++;
            }
            primeCount++;
        }
        
    }
    public static boolean Prime(int num){
        if(num <2)return false;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                return false;
            }
        }   return true;
    }
}
