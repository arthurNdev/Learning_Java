package estudos.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Arrays13 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, homensTotal, mulheresTotal;
        double menorAltura, maiorAltura, mulheresAltura, average;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        double[] height = new double[n];
        char[] gender = new char[n];

        for (int i=0; i<n; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            height[i] = sc.nextDouble();
            System.out.print("Gênero da " + (i+1) + "a pessoa: ");
            gender[i] = Character.toUpperCase(sc.next().charAt(0));
        }

        menorAltura = height[0];
        maiorAltura = height[0];

        for (int i=0; i<n; i++) {
            if (height[i] < menorAltura) {
                menorAltura = height[i];
            }
            if (height[i] > maiorAltura) {
                maiorAltura = height[i];
            }
        }

        System.out.println();
        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);

        mulheresAltura = 0;
        homensTotal = 0;
        mulheresTotal = 0;
        for (int i=0; i<n; i++) {
            if (gender[i] == 'F') {
                mulheresAltura += height[i];
                mulheresTotal++;
            }
            if (gender[i] == 'M') {
                homensTotal++;
            }
        }

        average = mulheresAltura / mulheresTotal;

        System.out.printf("Média das alturas das mulheres = %.2f%n", average);
        System.out.printf("Número de homens = %d", homensTotal);

        sc.close();
    }
}
