package estudos;

import java.util.Locale;
import java.util.Scanner;

public class Basics1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números?");
        int num = sc.nextInt();
        int total = 0;
        for (int i=0; i<num; i++) {
            System.out.println("Digite um número:");
            total += sc.nextInt();
        }
        System.out.println(total);

        sc.close();
    }
}
