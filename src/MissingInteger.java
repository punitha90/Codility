/*Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
*/


import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public static int solutions(int[] A) {

        if (A.length > 0) {
            Set h = new HashSet<Integer>();
            for (int i : A) {
                h.add(i);
            }
            int j;
            for (j = 1; j < A.length; j++) {
                if (!h.contains(j)) {
                    break;
                }
            }
            return j;
        } else {
            return 1;
        }

    }

    public static void main(String args[]) {

        int[] A = new int[]{-1, -2};
        int k = 3;
        int result = solutions(A);
        System.out.println(result);

    }

}
