/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg4;

import static java.lang.Math.sqrt;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author User
 */
public class L4Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> score = new ArrayList<Integer>();
        int ans;
        while(true){
            System.out.println("Enter score: ");
            ans = scan.nextInt();
            if(ans <0)
            break;
            
            score.add(ans);
            
        }
        int size =score.size();
        score.sort(null);
        int sum=0;
        int sumSquare=0;
        for(int i=0;i<size;i++){
            sum += score.get(i);
            sumSquare += score.get(i)*score.get(i);
        }
        double average = sum/size;
        double sd = sqrt((sumSquare-((sum*sum)/score.size()))/(size-1));
        int min = score.get(0);
        int max = score.get(size-1);
        
        System.out.println("Average is "+average);
        System.out.println("Min score is "+min);
        System.out.println("Max score is "+max);
        System.out.printf("Standard deviation is %.2f",sd);
        
    }

}
