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
public class L4Q4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scan.nextInt();
        System.out.println("Enter the first day(0 for Sun,1 for Mon,...): ");
        int firstDay = scan.nextInt();
        int May = (firstDay +120);
        int August = (firstDay + 212);
        
        //Count for leap year
        if((year%4==0&& year%100!=0)||year%400==0){
            May += 1;
            August += 1;
        }
        
        System.out.println("May");
        System.out.println("  S  M  T  W  T  F  S");//make sure each day is 3 char long (due to %3d - refer monh for loop)
        int startDayMay = (May)%7;
        int startDayAug = (August)%7;
        
        //Starting day of May
        for(int i=0;i<startDayMay;i++){
            System.out.print("   ");//whitespace is 3 char long since we use %3d(refer month for loop)
        }
        //Month of May
        for(int i=1;i<=31;i++){
            System.out.printf("%3d",i);//%3d make sure character meets 3 char requirement(for <3 char,whitespace is printed )
            if(((startDayMay+i)%7)==0){
                System.out.println();
            }
            
        }System.out.println("\n\nAugust");
        /*~~August~~*/
        System.out.println("  S  M  T  W  T  F  S");
        //Starting day of August
        for(int i=0;i<startDayAug;i++){
            System.out.print("   ");//whitespace is 3 char long since we use %3d(refer month for loop)
        }
        //Month of Aug
        for(int i=1;i<=31;i++){
            System.out.printf("%3d",i);//%3d make sure character meets 3 char requirement(for <3 char,whitespace is printed )
            if(((startDayAug+i)%7)==0){
                System.out.println();
            }
            
        }
    }
}
