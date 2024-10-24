import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Lab2 {
    public void celcius(){
        double fahrenheit = 100;
        double celcius = (fahrenheit-32)/1.8;
        System.out.println("\n*****Converting Fahrenheit to Celcius*****");
        System.out.printf("%.2f fahrenheit is equivalent to %.2f celcius\n", fahrenheit,celcius);
    }

    public void monthlyPayment(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n*****Calculating Monthly Payment of a Car*****");
        System.out.println("Enter price of the car:");
        float P = scan.nextFloat();
        System.out.println("Enter the down payment:");
        float D = scan.nextFloat();
        System.out.println("Interest rate: ");
        float R = scan.nextFloat();
        System.out.println("Loan duration(Years):");
        float Y = scan.nextFloat();


        double M = (P - D) * (1 + R*Y/100) / (Y *12);
        System.out.printf("Monthly payment is RM %.2f",M);
        System.out.println();



    }
    public void random(){
        Random random = new Random();
        float x = random.nextInt(10,50);
        float y = random.nextInt(10,50);
        float z = random.nextInt(10,50);
        float sum = x+y+z;
        float average = sum/3;
        System.out.println("\n*****Sum and Average of Three Random Numbers*****");
        System.out.printf("x: %.2f\ny: %.2f\nz: %.2f\n", x, y, z);
        System.out.printf("Sum is %.2f\nAverage is %.2f",sum,average);
        System.out.println();


    }
    public void time(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n*****Converting Seconds to Hours,Minutes, and Seconds*****");
        System.out.println("Enter the number of seconds: ");
        int seconds = scan.nextInt();
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int sec = seconds%60;
        System.out.println("Time is "+ hours+" hr,"+minutes+" min"+" and "+sec + " sec");

    }
    public void sumRandom(){
        Random random = new Random();
        int x = random.nextInt(0,10000);
        int sum = 0;
        int count = 0;
        while(count != x){
            sum += count;
            count++;
        }
        System.out.println("\n*****Sum of Random Numbers*****");
        System.out.println("Random Number: " + x);
        System.out.println("Sum: " + sum);
    }
    public void energy(){
        Scanner scan = new Scanner(System.in);
        System.out.println("*****Calculate energy required to heat up water*****");
        System.out.println("Enter amount of water in gram: ");
        int M = scan.nextInt();
        M /= 1000;
        System.out.println("Enter final temp in Fahrenheit: ");
        double ftemp = scan.nextDouble();
        ftemp = (ftemp-32)/1.8;
        System.out.println("Enter initial temp in Fahhrenheit: ");
        double itemp = scan.nextDouble();
        itemp = (itemp-32)/1.8;
        double Q = M *(ftemp-itemp)*4184;
        System.out.println("The energy is "+ Q);
    }
}
