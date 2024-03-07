package atm.machine.arima;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("This is a Demo ATM simulation");
        System.out.println("Initially you have been assigned an account and pin");
        account A = new account(12345, 100000.2F, 12345);
        Transaction transaction = new Transaction();

        Scanner sc = new Scanner(System.in);
        int pin;
        while (true) {
            System.out.println("ENTER PIN: ");
            pin = sc.nextInt();
            if (pin == A.getPIN()) {
                System.out.println("Verified");
                System.out.println("");
                break;
            }
            else {
                System.out.println("Invalid Pin");
            }
        }
        while (true) {
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Account Balance: " + A.checkBalance(pin));
                    break;
                case 2:
                    System.out.println("Withdraw Amount: ");
                    float amount = sc.nextFloat();
                    transaction.withdraw(A, amount);
                    break;
                case 3:
                    System.out.println("Deposit Amount: ");
                    float depositAmount = sc.nextFloat();
                    transaction.deposit(A, depositAmount);
                    break;
                case 4:
                    System.out.println("Thank you to be with US");
                    return;
                default:
                    System.out.println("Invalid Choice");
            }


        }
    }
}