public class Driver {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(0.04f);
        saver1.calcMonthlyInterest();
        saver2.calcMonthlyInterest();

        System.out.printf("Saver 1: $%.2f%n", saver1.savingsBalance());
        System.out.printf("Saver 2: $%.2f%n", saver2.savingsBalance());

        SavingsAccount.modifyInterestRate(0.05f);
        saver1.calcMonthlyInterest();
        saver2.calcMonthlyInterest();

        System.out.printf("Saver 1: $%.2f%n", saver1.savingsBalance());
        System.out.printf("Saver 2: $%.2f%n", saver2.savingsBalance());
    }
}
/*
Saver 1: $2006.67
Saver 2: $3010.00
Saver 1: $2015.03
Saver 2: $3022.54

Process finished with exit code 0
 */