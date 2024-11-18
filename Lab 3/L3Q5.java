import java.util.Scanner;

public class L3Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a,b,c,d,e,f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        
        double denominator = a * d - b * c;
        if (denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            // Apply Cramer's rule to find x and y
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;
            
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
