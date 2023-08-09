package estudos.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Arrays7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] num = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            num[i] = sc.nextDouble();
        }

        double maior = num[0];
        int posMaior = 0;
        for (int i=0; i<n; i++) {
            if (num[i] > maior) {
                maior = num[i];
                posMaior = i;
            }
        }

        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f%n", maior);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d%n", posMaior);

        sc.close();
    }
}
