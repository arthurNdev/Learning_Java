package estudos.arrays;

import java.util.Scanner;

public class Arrays11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];

        for (int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            names[i] = sc.nextLine();
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
        }

        int posMaisVelho = 0;
        int maisVelhoAge = ages[0];

        for (int i=0; i<n; i++) {
            if (ages[i] > maisVelhoAge) {
                maisVelhoAge = ages[i];
                posMaisVelho = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", names[posMaisVelho]);

        sc.close();
    }
}
