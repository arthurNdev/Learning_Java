package estudos.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Arrays12 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] score1 = new double[n];
        double[] score2 = new double[n];

        for (int i=0; i<n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do "
                    + (i+1) + "o aluno:");
            sc.nextLine();
            names[i] = sc.nextLine();
            score1[i] = sc.nextDouble();
            score2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");

        for (int i=0; i<n; i++) {
            double average = (score1[i] + score2[i]) / 2;
            if (average >= 6) {
                System.out.println(names[i]);
            }
        }

        sc.close();
    }
}
