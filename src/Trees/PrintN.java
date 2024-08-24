package Trees;
import java.util.*;

public class PrintN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer>[] G = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            G[i] = new ArrayList<>();
        }

        int i = 1;
        while (i <= n - 1) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            G[x].add(y);
            G[y].add(x);
            i++;
        }

        Queue<Integer> q = new LinkedList<>();
        int[] used = new int[n + 1];
        used[1] = 1;
        q.offer(1);

        while (!q.isEmpty()) {
            int node = q.poll();
            int c = 0;
            for (int u : G[node]) {
                if (used[u] == 0) {
                    c++;
                    used[u] = 1;
                    q.offer(u);
                }
            }

            System.out.println(node + " " + c);
        }
    }

}
