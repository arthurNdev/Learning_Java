package estudos.arrays;

import java.util.Scanner;

public class Arrays4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números? ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Os números pares digitados foram:");

        int pares = 0;
        for (int i=0; i<n; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
                pares++;
            }
        }
        System.out.println();
        System.out.printf("QUANTIDADE DE PARES = %d", pares);

        sc.close();
    }
}
