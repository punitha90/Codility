import java.util.HashSet;
import java.util.Set;

public class DistinctNumber {


    public static int solutions(int a[]) {

        if (a.length > 0) {
            Set set = new HashSet();
            for (int i : a) {
                set.add(i);
            }
            return set.size();
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {

        int[] A = new int[]{-2,-2};

        System.out.println(solutions(A));

    }
}
