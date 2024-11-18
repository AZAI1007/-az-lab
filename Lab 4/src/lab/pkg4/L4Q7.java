/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg4;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author User
 */
public class L4Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter principal amount: ");
        int principal = scanner.nextInt();
        System.out.println("Enter interest in %: ");
        double interest = scanner.nextDouble();
        System.out.println("Enter total number of month(s)");
        int month = scanner.nextInt();
        
        System.out.println("Month\t\tMonthly Payment\t\tPrincipal\t\tInterest\t\tUnpaid Balance\t\tTotal Interest");
        double totalInterest=0;
        
        
        for(int i = 1;i<=month;i++){
            double monthlyPayment = (principal*(interest/1200))/(1-(Math.pow((1+(interest/1200)),(-1*month))));
            double C = monthlyPayment*(Math.pow((1+(interest/1200)),(-1*(1+month-i))));
            double L = monthlyPayment-C;
            double R = L/(interest/1200)-C;
            totalInterest += L ;
            System.out.printf("%d\t\t%.2f\t\t\t%.2f\t\t\t%.2f\t\t\t%.2f\t\t\t%.2f\t\t\t",i,monthlyPayment,C,L,R,totalInterest);
            System.out.println();
        }
    }
}
