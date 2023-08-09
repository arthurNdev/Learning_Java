package estudos.arrays;

import entities.Product2;

import java.util.Locale;
import java.util.Scanner;

public class Arrays2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos?");
        int n = sc.nextInt();
        Product2[] vet = new Product2[n];

        for (int i=0; i<vet.length; i++) {
            sc.nextLine();
            System.out.print("Product: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            vet[i] = new Product2(name, price);
        }

        double sum = 0;
        for (Product2 product2 : vet) {
            sum += product2.getPrice();
        }

        double avg = sum / vet.length;

        System.out.printf("AVERAGE PRICE = %.2f", avg);

        sc.close();
    }
}
