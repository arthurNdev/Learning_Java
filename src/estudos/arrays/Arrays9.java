package estudos.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Arrays9 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter no array? ");
        int escolha = sc.nextInt();

        double[] array = new double[escolha];

        double sum = 0;
        for (int i=0; i<escolha; i++) {
            System.out.print("Digite um número: ");
            array[i] = sc.nextDouble();
            sum += array[i];
        }

        double average = sum / escolha;
        System.out.println();
        System.out.printf("MÉDIA DO VETOR = %.3f%n", average);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for (int i=0; i<escolha; i++) {
            if (array[i] < average) {
                System.out.println(array[i]);
            }
        }

        sc.close();
    }
}
