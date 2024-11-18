/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vivaq1;
/**
 *
 * @author az
 */
import java.util.Scanner;

public class VivaQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = scanner.nextLine();
        
//        String total = num;
//        while(total >= 10){
//            int sum = 0;
//            for(long i = total; i>0; i/=10){
//                sum += i%10;//adds last digit to sum
//            }
//            total = sum;
//        }
//        System.out.println("Sum of digits until single digit: "+total);
        int sum = 0;
        int total = Integer.parseInt(num);
        while(total >= 10){
            for(int i = 0;i<num.length();i++){
            sum += Character.getNumericValue(num.charAt(i));  
        }
            System.out.println(sum);
        total = sum;
     }
        System.out.println("Sum of digits until single digit: "+total);
        
    }
}
