/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L1Q3;

/**
 *
 * @author User
 */
public class l1q3 {
    static String[] shapes = new String[10];
    public static void main(String[] args) {
        l1q3.square();
        l1q3.circle();
        l1q3.arrow();
        l1q3.diamond();
    }
    
    public static void square(){
        System.out.println("""
                           *************
                           *           *
                           *           *
                           *           *
                           *           *
                           *           *
                           *           *
                           *************
                           """); // use triple commas to create arts
                
            System.out.println("Square\n");
            shapes[0] = "*".repeat(10);
            System.out.println(shapes[0]);
            for(int i = 0; i<=5;i++){
                for(int j=0 ; j < 10;j++){
                    if(j == 0 || j == 9){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");}
                }
                System.out.println("");
            }
            shapes[9] = "*".repeat(10);
            System.out.println(shapes[9]);
            
            
     }
    
     public static void circle(){
         System.out.println("\nCircle\n");
         System.out.println(shapes[0] = " ".repeat(4) + "*".repeat(3) + " ");
         System.out.println(shapes[0] = " ".repeat(2) + "*" + " ".repeat(5) + "*");
         for(int j=0 ; j < 5;j++){
            System.out.println("*" + " ".repeat(9) + "*");
         }
         System.out.println(" ".repeat(2) + "*" + " ".repeat(5) + "*");
         System.out.println(" ".repeat(4) + "*".repeat(3) + " ");
         
     }
     public static void arrow(){
         System.out.println("\nArrow\n");
         System.out.println("""
                                 *
                                ***
                               *****
                                 *
                                 *
                                 *
                                 *
                                 *
                                 
                            """);
     }
     public static void diamond(){
         System.out.println("\nDiamond\n");
         System.out.println("""
                                 *
                                * *
                               *   *
                              *     *
                             *       *
                            *         *
                             *       *
                              *     *
                               *   *
                                * *
                                 *
                                 
                            """);
     }
}       
