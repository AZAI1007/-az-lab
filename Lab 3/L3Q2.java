import java.util.HashMap;
import java.util.Random;

public class L3Q2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        Random random = new Random();
        hashmap.put(0,"zero");
        hashmap.put(1,"one");
        hashmap.put(2,"two");
        hashmap.put(3,"three");
        hashmap.put(4,"four");
        hashmap.put(5,"five");
        int x = random.nextInt(0,5);
        System.out.println("Random number: " + x);
        System.out.println(x + " is " + hashmap.get(x));

    }
}
