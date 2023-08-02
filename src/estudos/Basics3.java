package estudos;

import java.util.Scanner;

public class Basics3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você quer ler?");
        int qntd = sc.nextInt();
        for (int i = 0; i < qntd; i++) {
            System.out.println("Digite um número:");
            int num = sc.nextInt();
            if (num >= 10 && num <= 20) {
                System.out.printf("%d in%n", num);
            }
            else {
                System.out.printf("%d out%n", num);
            }
        }
    sc.close();
    }
}
