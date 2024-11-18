//Question1
import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter move: ");
        String move = scan.nextLine();

        for(int i=0;i<move.length();i++){
            switch(move.charAt(i)){
                case 'R':
                    x+=1;
                    break;
                case 'U':
                    y+=1;
                    break;
                case 'L':
                    x-=1;
                    break;
                case 'D':
                    y-=1;
                    break;
                default:
                    System.out.println("Invalid");

            }

        }System.out.println(x +" "+y);


    }
}
