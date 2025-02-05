package FenwickTree;

public class One {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 1, 3, 2}; // Example array (1-based indexing)
        FenwickTree fenwickTree = new FenwickTree(arr.length);

        // Constructing Fenwick Tree
        for (int i = 1; i < arr.length; i++) {
            fenwickTree.update(i, arr[i]);
        }

        // Querying sums
        System.out.println("Sum of first 5 elements: " + fenwickTree.getPrefixSum(5)); // Output: 9
        System.out.println("Sum from index 2 to 4: " + fenwickTree.getRangeSum(2, 4)); // Output: 5

        // Updating an element
        fenwickTree.update(3, 3); // Increment element at index 3 by 3

        System.out.println("Updated sum of first 5 elements: " + fenwickTree.getPrefixSum(5)); // Output will change accordingly
    }
}

class FenwickTree {
    private int[] BITree;
    private int size;

    public FenwickTree(int size) {
        this.size = size;
        BITree = new int[size + 1]; // 1-based indexing
    }

    // Function to update a value at a given index
    public void update(int index, int value) {
        while (index <= size) {
            BITree[index] += value; // Update BITree
            index += (index & -index); // Move to next index
        }
    }

    // Function to get prefix sum up to a given index
    public int getPrefixSum(int index) {
        int sum = 0;
        while (index > 0) {
            sum += BITree[index]; // Add current index value
            index -= (index & -index); // Move to parent index
        }
        return sum;
    }

    // Function to get range sum between two indices
    public int getRangeSum(int leftIndex, int rightIndex) {
        return getPrefixSum(rightIndex) - getPrefixSum(leftIndex - 1);
    }


}


