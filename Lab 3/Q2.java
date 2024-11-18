import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int totalQuestions = 0;
        
        while (true) {
            // Prompt user to enter a number
            System.out.print("Enter a number (-1 to quit): ");
            int number = scan.nextInt();
            
            // Exit the loop if the user enters -1
            if (number == -1) {
                break;
            }
            
            // Prompt user to enter a factor
            System.out.print("Enter a factor: ");
            int factor = scan.nextInt();
            scan.nextLine(); // Consume newline
            
            // Check if factor is actually a factor of the number
            boolean isFactor = (number % factor == 0);
            System.out.printf("%d is a factor of %d? (true/false): ", factor, number);
            
            // Get user's answer
            boolean userAnswer = Boolean.parseBoolean(scan.nextLine());
            totalQuestions++;
            
            // Check user's answer against the correct answer
            if (userAnswer == isFactor) {
                System.out.println("Your answer is correct.");
                score++;
            } else {
                System.out.println("Your answer is incorrect.");
            }
        }
        
        // Display the final score
        System.out.printf("The final score is %d/%d\n", score, totalQuestions);
       
    }
}

