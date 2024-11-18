import java.util.Scanner;
public class L3Q1{
    public static void main(String[] args) {
        System.out.println("Enter two integers: ");
        Scanner scan = new Scanner(System.in);
        int z = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("Enter operand: ");
        String oper = scan.next();
    
        switch(oper){
            case "+":
                int sum = z + y;
                System.out.println(z + " + "+ y + " = " + (z+y));
                break;
            
            case "-":
                System.out.println(z + " - "+ y + " = " +(z-y));
                break;
            
            case "*":
                System.out.println(z + " * "+ y + " = " + (z*y));
                break;
    
            case "/":
                System.out.println(z + " / "+ y + " = " + (z/y));
                break;
    
            case "%":
                System.out.println(z + " + "+ y + " = " + (z%y));
                break;
            
            default:
                System.out.println("Invalid input");
                break;
            
        }
    }
    
}
