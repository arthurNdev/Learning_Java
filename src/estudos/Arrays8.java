package estudos;

import java.util.Locale;
import java.util.Scanner;

public class Arrays8 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada array? ");
        int n = sc.nextInt();

        int[] arrayA = new int[n];
        int[] arrayB = new int[n];

        System.out.println("Digite os valores do array A:");
        for (int i=0; i<n; i++) {
            arrayA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do array B:");
        for (int i=0; i<n; i++) {
            arrayB[i] = sc.nextInt();
        }

        System.out.println("ARRAY RESULTANTE:");
        for (int i=0; i<n; i++) {
            System.out.println(arrayA[i] + arrayB[i]);
        }

        sc.close();
    }
}
