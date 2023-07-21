package estudos;

import java.util.Scanner;

public class Arrays3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int num = sc.nextInt();
        int[] array = new int[num];

        for (int i=0; i<num; i++) {
            System.out.print("Digite um número: ");
            int escolha = sc.nextInt();
            array[i] = escolha;

        }

        System.out.println();
        System.out.println("NÚMEROS NEGATIVOS:");

        for (int i=0; i<num; i++) {
            if (array[i] < 0) {
                System.out.println(array[i]);
            }
        }

        sc.close();
    }
}
