package OAs.AMAZON;

public class OADublin2023 {
    //amazon organiznig party, there are q events : "+x" denotes entered peoples, "-x" denotes people left the party. Find max no of people at any time
    //at the party, return -1 if series of events is not possible
//    eg: q [+  +  -  +  +] and people[1  2  2  3  4] -> e1 = 1, e2 = 2, e3 = 1, e4 = 2, e5 = 3 => at max 3 people are in party

    //query size == people size
    static int maxPeople (int[] people, char[] query) {
        if (query.length != people.length) return 0;
        int count = 0;
        int max = 0;
        for (int i = 0; i < people.length; i++) {
            //check if people is entering or leaving
            if (query[i] == '+') count ++;
            else if (query[i] == '-') count--;
            if (count == 0) return 0;
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] ppl = {1,2,1};
        char[] q = {'+', '+', '-'};
        System.out.println(maxPeople(ppl, q));
    }
}
