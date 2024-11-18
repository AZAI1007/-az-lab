/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L4Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer, n: ");
        int n = scan.nextInt();
        int count =1;
        int sum=0;
        do{
            int count2 = 0;
            for(int i=1;i<=count;i++){
                count2 +=i;
            }
            sum += count2;
            count++;
        }while(count <= n);
        System.out.println(sum);
    }

}
