package estudos;

import java.util.Scanner;

public class Arrays11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];

        int maisVelhoAge = 0;
        String maisVelhoName = names[0];

        for (int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            names[i] = sc.nextLine();
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
            if (ages[i] > maisVelhoAge) {
                maisVelhoName = names[i];
                maisVelhoAge = ages[i];
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", maisVelhoName);

        sc.close();
    }
}
