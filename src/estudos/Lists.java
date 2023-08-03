package estudos;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Armando");
        list.add("Bob");
        list.add("Anna");
        list.add("Bea");
        list.add("Arthur");
        list.add(2, "Marco");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println(list.size());

        System.out.println("===============================");


        list.remove("Anna");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("===============================");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco" + list.indexOf("Marco"));

        System.out.println("===============================");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("===============================");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
        String name2 = list.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);
        System.out.println(name2);
    }
}
