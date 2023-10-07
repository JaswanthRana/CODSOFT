package atmmachine;
import java.util.*;
public class AtmMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(20000);
        while (true) {
            System.out.println("Welcome to the ATM machine Interface");
            System.out.println("Please select an option to be performed using ATM :");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Enter the amount to be withdrawn: ");
                    double withdrawAmount = sc.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful");
                    } else {
                        System.out.println("Insufficient balance in your account!");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to be deposited into your account: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit is Successful!!!.");
                    break;
                case 3:
                    System.out.printf("Your current balance is Rs.%.2f /-\n", account.getBalance());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid option!!!");
            }
        }        
    }
}
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance = balance- amount;
            return true;
        } else {
            return false;
        }
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public double getBalance() {
        return balance;

}
}