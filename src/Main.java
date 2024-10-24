import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Lab2 lab = new Lab2();
//        lab.energy();
//        lab.sumRandom();
//        lab.celcius();
//        lab.monthlyPayment();
//        lab.random();
//        lab.time();
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1: Convert Fahrenheit to Celcius");
        System.out.println("2: Calculate monthly payment of a car");
        System.out.println("3: Display the sum and average of 3 random number between 10 to 50");
        System.out.println("4: Converting Seconds to Hours,Minutes, and Seconds");
        System.out.println("5: Sum of Random Numbers");
        System.out.println("6: Calculate energy required to heat up water");

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                lab.celcius();
                break;
            case 2:
                lab.monthlyPayment();
                break;
            case 3:
                lab.random();
                break;
            case 4:
                lab.time();
                break;
            case 5:
                lab.sumRandom();
                break;
            case 6:
                lab.energy();
                break;
            default:
                System.out.println("Pilih betul betul la anjir");
        }
    }
}
