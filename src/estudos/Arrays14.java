package estudos;

import entities.Rent;

import java.util.Scanner;

public class Arrays14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        Rent[] reservas = new Rent[10];

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();
            reservas[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i=0; i<10; i++) {
            if (reservas[i] != null) {
                System.out.println(i + ": " + reservas[i]);
            }
        }

        sc.close();
    }
}
