import java.util.Scanner;

public class L3Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius(m): ");
        double radius = scanner.nextDouble();
        System.out.println("Enter cordinate (x,y): ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double distance = Math.sqrt(x*x+y*y);

        if(distance > radius){
            System.out.println("Coordinate is outside the circle.");
        }
        else{
            System.out.println("Coordinate is inside or on the circle");
        }
    }
}
