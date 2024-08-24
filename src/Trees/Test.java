package Trees;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        float wt[] = {(float) 1.01, (float) 1.99, (float) 2.5, (float) 1.5, (float) 1.01};
        System.out.println(efficientJanitor(wt));
    }
    public static int efficientJanitor(float[] weight) {
        // Write your code here
        float wt = 0;
        int trips = 0;
        int n = weight.length;
        int i = 0, j = 0;
        while (j < n) {
            if (wt < 3.00) {
                wt += weight[j];
//                j++;
            }
            else if (wt > 3.00) {
                trips++;
                wt = weight[j];
                i = j;
            }
            j++;
        }
        return trips;
    }
}
