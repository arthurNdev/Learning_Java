package estudos;

import entities.ClientBank;

import java.util.Locale;
import java.util.Scanner;

public class Poo8 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ClientBank clientBank;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit? (y/n)? ");
        char response = sc.nextLine().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            clientBank = new ClientBank(name, accountNumber, initialDeposit);
        }
        else {
            clientBank = new ClientBank(name, accountNumber);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(clientBank);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        clientBank.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(clientBank);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        clientBank.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(clientBank);

        sc.close();
    }
}
