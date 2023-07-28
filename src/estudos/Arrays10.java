package estudos;

import java.util.Locale;
import java.util.Scanner;

public class Arrays10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter no array? ");
        int n = sc.nextInt();

        int[] num = new int[n];

        int paresTotal = 0;
        int paresCont = 0;
        for (int i=0; i<n; i++) {
            System.out.print("Digite um número:");
            num[i] = sc.nextInt();
            if (num[i] % 2 == 0) {
                paresTotal += num[i];
                paresCont++;
            }
        }

        double average = (double) paresTotal / paresCont;

        if (paresTotal > 0) {
            System.out.printf("MÉDIA DOS PARES = %.1f", average);
        }
        else {
            System.out.println("NENHUM NÚMERO PAR.");
        }

        sc.close();
    }
}
