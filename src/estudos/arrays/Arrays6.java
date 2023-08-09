package estudos.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Arrays6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] ages = new int[n];
        double[] heights = new double[n];

        double sumHeight = 0;
        int agesUnder16 = 0;
        for (int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            names[i] = sc.nextLine();
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
            sc.nextLine();
            if (ages[i] < 16) {
                agesUnder16++;
            }
            System.out.print("Altura: ");
            heights[i] = sc.nextDouble();
            sc.nextLine();
            sumHeight += heights[i];
        }

        double averageHeight = sumHeight / n;
        double percentAgesUnder16 = (double) agesUnder16 / n * 100;
        System.out.println();
        System.out.printf("Altura média: %.2f", averageHeight);
        System.out.println();
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentAgesUnder16);

        for (int i=0; i<n; i++) {
            if (ages[i] < 16) {
                System.out.println(names[i]);
            }
        }

        sc.close();
    }
}
