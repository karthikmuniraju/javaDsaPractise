import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 1, 3, 5};
        Set<Integer> set = new HashSet();

        for(int number : arr) {
            set.add(number);
        }

        System.out.println(set);
    }
}
