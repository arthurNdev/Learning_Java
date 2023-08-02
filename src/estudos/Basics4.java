package estudos;

import java.util.Scanner;

public class Basics4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números?");
        double quantos, n1, n2;

        quantos = sc.nextInt();
        for (int i = 0; i<quantos; i++) {
            System.out.println("Digite um número:");
            n1 = sc.nextDouble();
            System.out.println("Digite outro número:");
            n2 = sc.nextDouble();
            if (n2 == 0) {
                System.out.println("Divisão impossível");
            }

            else {
                System.out.println(n1 / n2);
            }

        }
    sc.close();
    }
}
