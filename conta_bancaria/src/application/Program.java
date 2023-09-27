package application;
import entities.BankAccount;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // DATA INPUT
        System.out.print("Enter account number: ");
        int bankAccountNumber = scan.nextInt();
        System.out.print("Enter account holder: ");
        scan.nextLine();
        String holderName = scan.nextLine();
        System.out.print("Is there a initial deposit? (Y / N): ");
        char response = scan.next().charAt(0);

        // RESPONSE FOR STARTING VALUE
        double openingBalance = 0;
        if (response == 'Y' || response == 'y'){
            if (openingBalance == 0){
                System.out.print("Enter initial value: ");
                openingBalance = scan.nextDouble();
            }
        }

        // Opening balance validation
        while ( openingBalance < 0 ) {
            System.out.println();
            System.out.println("Oops, negative balance! Enter a new value equal to or greater than 0!");
            System.out.print("Enter initial value: ");
            openingBalance = scan.nextDouble();
        }


        BankAccount bankAccount1 = new BankAccount(holderName, bankAccountNumber, openingBalance);

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(bankAccount1.toString());

        // DEPOSIT
        System.out.println();
        System.out.println("Enter a deposit value:");
        double deposit = scan.nextDouble();
        bankAccount1.depositOperation(deposit);
        System.out.println("Updated account data");
        System.out.println(bankAccount1.toString());

        // WITHDRAW
        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdraw = scan.nextDouble();
        bankAccount1.withdrawOperation(withdraw);
        System.out.println("Updated account data: ");
        System.out.println(bankAccount1.toString());



        scan.close();
    }
}