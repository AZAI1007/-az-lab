/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg4;

import static java.lang.Math.abs;
import java.util.Random;

/**
 *
 * @author User
 */
public class L4Q6 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Random random = new Random();
        int x = abs(random.nextInt());
        for(int i =0;i<30;i++){
            System.out.println(random.nextInt(1,7));
        }
        int y = random.nextInt(1,6);
        int digit = Integer.toString(x).length();
        System.out.println("Random number: "+x);
        System.out.println("Digit count is "+digit);
        
    }
}
