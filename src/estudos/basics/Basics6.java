package estudos.basics;

import java.util.Scanner;

public class Basics6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            double quadrado = Math.pow(i,2);
            double cubo = Math.pow(i,3);
            System.out.printf("%d ", i);
            System.out.printf("%.0f ", quadrado);
            System.out.printf("%.0f%n", cubo);

            sc.close();
        }

    }
}
