package estudos;

import java.util.Scanner;

public class Matriz2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas? ");
        int m = sc.nextInt();

        System.out.print("Quantas colunas? ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite um número: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Qual número você deseja consultar? ");
        int consult = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == consult) {
                    System.out.printf("Position %d,%d:%n", i, j);
                    if (j > 0) {
                        System.out.printf("Left: %d%n", matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.printf("Up: %d%n", matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.printf("Right: %d%n", matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.printf("Down: %d%n", matriz[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
