public class Driver {
    public static void main(String[] args) {
        SpecialSavings saver1 = new SpecialSavings(2000);
        SpecialSavings saver2 = new SpecialSavings(3000);

        SavingsAccount.modifyInterestRate(0.08f);
        saver1.calcMonthlyInterest();
        saver2.calcMonthlyInterest();

        System.out.printf("Saver 1: $%.2f%n", saver1.savingsBalance());
        System.out.printf("Saver 2: $%.2f%n", saver2.savingsBalance());

        saver1.withdraw(1500);
        saver2.deposit(9500);

        System.out.printf("Saver 1: $%.2f%n", saver1.savingsBalance());
        System.out.printf("Saver 2: $%.2f%n", saver2.savingsBalance());

        saver1.calcMonthlyInterest();
        saver2.calcMonthlyInterest();

        System.out.printf("Saver 1: $%.2f%n", saver1.savingsBalance());
        System.out.printf("Saver 2: $%.2f%n", saver2.savingsBalance());

        saver1.calcMonthlyInterest();
        saver2.calcMonthlyInterest();

        System.out.printf("Saver 1: $%.2f%n", saver1.savingsBalance());
        System.out.printf("Saver 2: $%.2f%n", saver2.savingsBalance());
    }
}
/*
Saver 1: $2013.33
Saver 2: $3020.00
Saver 1: $513.33
Saver 2: $12520.00
Saver 1: $516.76
Saver 2: $13772.00
Saver 1: $520.20
Saver 2: $15149.20

Process finished with exit code 0
 */