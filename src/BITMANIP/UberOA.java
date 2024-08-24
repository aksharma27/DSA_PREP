package BITMANIP;

public class UberOA {
//    Q) Find the pairs (i,j) that they follow the condition : B[i] xor B[j] > B[i] & B[j]
//    Brute force : using nested for loop and check for each pair in N*N time

//    OPTIMAL :
//    given constraint : n <= 10^9 ==> 2^29 ==> in binary, a max of 29+1 = 30 bits can be allowed
//  1) 2^y = y+1 digits in binary form ==> for condition to satisfy, we need to check the MSB of both numbers :
//        a) MSB of n1 = 1 & MSB of n2 = 0, then condition is satisfied, coz xor of n1 and n2 will always be greater than the & of n1 and n2 in this case
//    so check B[j] = 1?????? and B[i] = 0?????, then (i, j) will be a vlid pair

    public static void main(String[] args) {
        int[] arr = {4,3,5,2};
        int[] count_set_bits = new int[arr.length];
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            int idx = findLeftMostSetBitIndex(arr[j]);
            count += count_set_bits[idx];
            count_set_bits[idx]++;
        }
        int n = arr.length;
        int toal = (n * (n - 1)) / 2; //total possible pairs
        System.out.println(toal - count);   //remove bad pairs from total to get good pairs
    }

    static int findLeftMostSetBitIndex (int num) {
        int idx = 31; //starting from MSB, then go on to the LSB one by one
        while (((num >> idx) & 1) == 0 && idx > 1) {
            idx--;  //go towards LSB when we'll encounter a set digit the loop terminates and we got the set bit idx
        }
        return idx;
    }
}
