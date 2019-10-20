public class SavingsAccount {
    private static float annualInterestRate = 0f;
    private float savingsBalance;

    public SavingsAccount(float balance) {
        savingsBalance = balance;
    }

    public static void modifyInterestRate(float r) {
        if (r >= 0 && r <= 1)
            annualInterestRate = r;
        else
            throw new IllegalArgumentException("Invalid interest rate amount");
    }

    private float calculateMonthlyInterest() {
        return savingsBalance * annualInterestRate / 12;
    }

    public float addedInterest() {
        return savingsBalance + calculateMonthlyInterest();
    }

    public String toString() {
        return String.format("%.2f", addedInterest());
    }

    public static void main(String args[]){
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        System.out.println("Saver 1 Starting Balance: 2000.00");
        System.out.println("Saver 1 Starting Balance: 3000.00");
        System.out.println("");
        SavingsAccount.modifyInterestRate(0.04f);
        System.out.println("Saver 1 Account Balance (4%): " + saver1);
        System.out.println("Saver 2 Account Balance (4%): " + saver2);
        System.out.println("Change Implemented");
        SavingsAccount.modifyInterestRate(0.05f);
        System.out.println("Saver 1 Account Balance (5%): " + saver1);
        System.out.println("Saver 2 Account Balance (5%): " + saver2);
    }

}
