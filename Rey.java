import java.util.Scanner;

public class Rey { // Palitan mo class name
    private double balance;
    public static double interestRate = 0;

    public Rey() { // Ito din palitan mo class name kagaya nung public class mo
        balance = 0;
    }

    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            amount = 0;
        }
        return amount;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }

    public static void showBalance(Rey account) {
        System.out.println("Your balance is " + account.getBalance());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rey savings = new Rey(); // Ito din palitan mo class name kagaya nung public class mo

        System.out.print("Enter interest rate: ");
        double interestRate = scanner.nextDouble();
        

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        savings.deposit(depositAmount);
        

        System.out.print("Press D for another deposit or W to withdraw: ");
        char action = scanner.next().charAt(0);

        if (action == 'D' || action == 'd') {
            System.out.print("Enter deposit amount: ");
            depositAmount = scanner.nextDouble();
            savings.deposit(depositAmount);
        } else if (action == 'W' || action == 'w') {
            System.out.print("Enter withdraw amount: ");
            double withdrawAmount = scanner.nextDouble();
            
        }

        if (savings.getBalance() > 1000) {
            savings.addInterest();
            System.out.println("Your new balance with interest is " + savings.getBalance());
        } else {
            
        }

       
    }
}
