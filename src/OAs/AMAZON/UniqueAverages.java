package OAs.AMAZON;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueAverages {
//    n developers in amazon, ith dev has experience points exp[i]. Company pairs 2 developer with highest and lowest remaining points iteratively
//    combined exp of a pair is the avg of both. Find no of unique combined exps.
public static void main(String[] args) {
    int[] exp = {1,1,3,6,5,4};
    System.out.println(solve(exp));
}
 static int solve (int[] points) {
        int unique = 0;
     Arrays.sort(points);
     Set<Double> avg = new HashSet<>();
     int i = 0, j = points.length-1;
     while (i < j) {
         double check = (double)(points[j] + points[i]) / 2;
         if (!avg.contains(check)) {
             avg.add(check);
         }
         i++; j--;
     }
     return avg.size();
 }
}
