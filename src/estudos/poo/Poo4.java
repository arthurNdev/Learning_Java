package estudos.poo;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Poo4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.t1 = sc.nextDouble();
        student.t2 = sc.nextDouble();
        student.t3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

        if (student.finalGrade() >= 60) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", student.points());
        }

        sc.close();
    }
}
