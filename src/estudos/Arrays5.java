package estudos;

import java.util.Locale;
import java.util.Scanner;

public class Arrays5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] numbers = new double[n];

        double sum = 0;
        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        System.out.println();
        System.out.print("VALORES = ");
        for (int i=0; i<n; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.printf("SOMA = %.2f%n", sum);

        double media = sum / n;
        System.out.printf("MÉDIA = %.2f", media);

        sc.close();
    }
}
