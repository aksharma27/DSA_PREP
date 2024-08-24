package Trees;
import java.util.*;

public class PrintChild {

    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(2).add(1);
//        adj.get(2).add(4);
//        adj.get(4).add(2);
        adj.get(1).add(3);
        adj.get(3).add(1);
//        adj.get(0).add(1);
//        adj.get(0).add(1);

        printChildren(adj, 3, 1);

    }

    static void printChildren(List<List<Integer>> adj, int V, int src) {
        int[] vis = new int[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        vis[src] = 1;
        int count = 0;
        int[] numberOfChildforIthParent = new int[V];
        while (!q.isEmpty()) {
            Integer node = q.poll();
            for (Integer child : adj.get(node)) {
                if (vis[child] == 0) {
                    //it is not visited before --> child : so mark visited and push into the queue
                    vis[child] = 1;
                    q.add(child);
                    count++;
                } else {
                    //parent node
                    numberOfChildforIthParent[node] = count;        //number of children for parent node
                }
            }
        }
//        for getting number of childs : run a for loop in numberOfChildforIthParent array, and if any index count is 0 ==> no children ==> leaf node
        for (int i = 0; i < numberOfChildforIthParent.length; i++) {
            System.out.println(numberOfChildforIthParent[i]);
            if (numberOfChildforIthParent[i] == 0) {
                System.out.println("Leaf Node");
            }
        }
//        return numberOfChildforIthParent;

    }
}
