import java.util.Random;
import java.util.Scanner;

public class scheduler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the number of staff [N]: ");
        int n = scan.nextInt();
        
        int count = 0;

        for (int i = 0; i < n; i++) {
            
            int staffID = 10000 + random.nextInt(90000);  
            System.out.println("Staff ID : " + staffID);
            int secondDigit = (staffID / 1000) % 10;
            int fourthDigit = (staffID / 10) % 10;
            if (secondDigit % 2 != 0 && fourthDigit % 2 == 0) {
                System.out.println("Weekend Duty");
                count++;
            } else {
                System.out.println("Weekend Off");
            }
        }
        
        System.out.println("The number of staff who work during the weekend is " + count);
        
        
    }
}

