/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg4;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class L4Q1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int x = scan.nextInt();
        System.out.println("Factors are: ");
        for(int i =1;i<=x;i++){
            if(x%i == 0){
                System.out.print(i+" ");
            }
        }
    }
    
}
