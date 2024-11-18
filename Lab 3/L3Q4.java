import java.util.Random;
public class L3Q4 {
    public static void main(String[] args) {
        Random random = new Random();
        int one1 = random.nextInt(1, 6);
        int one2 = random.nextInt(1, 6);
        int oneScore = one1 + one2;

        int two1 = random.nextInt(1, 6);
        int two2 = random.nextInt(1, 6);
        int twoScore = two1 + two2;
        
        if(twoScore > oneScore){
            System.out.println("Player two wins with a score of " + twoScore);
        }
        else if(twoScore == oneScore){
            System.out.println("Tied with a score of " + twoScore);
        }
        else{
            System.out.println("Player one wins with a score of "+oneScore);
        }

    }
}
