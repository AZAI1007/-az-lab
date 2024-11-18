import java.util.Scanner;
public class L3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of sales: ");
        double sales = scanner.nextDouble();

        if(sales <= 100){
            sales = 0.05 * sales;
            System.out.printf("Your comission is RM %.2f",sales);
        }
        else if(sales > 100 && sales <= 500){
            sales = 0.075 * sales;
            System.out.printf("Your comission is RM %.2f",sales);
        }
        else if(sales > 500 && sales <= 1000){
            sales = 0.10 * sales;
            System.out.printf("Your comission is RM  %.2f",sales);
        }
        else if(sales > 1000){
            sales = 0.125 * sales;
            System.out.printf("Your comission is RM %.2f",sales);
        }
        else{
            System.out.println("Invalid");
        }
        
        

    }
}
