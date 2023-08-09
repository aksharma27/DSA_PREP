package Contests.Biweekly;

public class PurchaseAmount {
    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        int correct = Math.abs(10 - purchaseAmount);
        int rounded = ((purchaseAmount + correct) % 10 == 0) ? purchaseAmount+correct : purchaseAmount-correct;
        // else purchaseAmout += correct;
        return 100 - rounded;
    }

    public static void main(String[] args) {
        System.out.println(accountBalanceAfterPurchase(16));
    }
}
