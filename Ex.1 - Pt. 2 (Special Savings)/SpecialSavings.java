public class SpecialSavings extends SavingsAccount {
    SpecialSavings(float annualInterestRate) {
        super(annualInterestRate);
    }

    @Override public void calcMonthlyInterest() {
        deposit((savingsBalance() >= 10000 ?
                0.1f : annualInterestRate() / 12) * savingsBalance());
        // Flat 10% annual on accounts >= $10,000, otherwise fetch current rate
    }
}
