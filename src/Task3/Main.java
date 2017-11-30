package Task3;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int [] array = {7, 7, 10, 10};
        System.out.println("Колличество элементов");
        System.out.println(array.length);
        Set<Integer> mySet = new HashSet<>();
        for (int x: array) {
            mySet.add(x);
            System.out.println("Колличество различных элементов");
            System.out.println(mySet.size());
        }
    }
}
