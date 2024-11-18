import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String durian;
        double total = 0;
        double sales;
        do{
            
            System.out.println("Enter type of durian: ");
            durian = scan.nextLine();
            if (durian.equals("Quit")) {
                break;
            }
            System.out.println("Enter sales: ");
            sales = scan.nextDouble();
            scan.nextLine();
            switch(durian){
                case "MK":
                    total += sales*25;
                    break;
                case "HL":
                    total += sales*22;
                    break;
                case "D24":
                    total += sales*20;
                    break;
                case "UM":
                    total += sales*18;
                    break;
                default:
                    System.out.println("Invalid");
                    break;

            }
        }while(!durian.equals("Quit"));
        System.out.printf("Total sales is %.2f",total);
    }
}
