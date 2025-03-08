public class SavingsAccount {
    // Store as a decimal. 12% = 0.12
    private static float annualInterestRate;
    private float savingsBalance;
    private float beforeInterest;

    // Constructors
    public SavingsAccount() {
        // do nothing
    }

    protected SavingsAccount(float savingsBalance) {
        this.savingsBalance = savingsBalance;
        this.beforeInterest = savingsBalance;
    }

    // Getters, setters
    public static float annualInterestRate() {
        return annualInterestRate;
    }

    public float savingsBalance() {
        return savingsBalance;
    }

    public float interestEarned() {
        return savingsBalance - beforeInterest;
    }

    // Methods
    protected void modifyInterestRate(float rate) {
        zeroCheck(rate);
        annualInterestRate = rate;
    }

    // Should the account compound monthly or receive flat payments?
    // This implementation recalculates the monthly interest based
    // on monthly balance
    public void calcMonthlyInterest() {
       savingsBalance += savingsBalance * (annualInterestRate / 12);
    }

    public void deposit(float amount) {
        zeroCheck(amount);
        savingsBalance += amount;
        beforeInterest += amount;
    }

    public void withdraw(float amount) {
        zeroCheck(amount);
        savingsBalance -= amount;
    }

    protected void zeroCheck(float check) {
        if (check <= 0) {
            throw new IllegalArgumentException(
                    "Input must be greater than 0");
        }
    }
}
