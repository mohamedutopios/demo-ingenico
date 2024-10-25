package org.example.stream;

import java.util.*;

public class Demo1 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("toto",
                "aurelien", "sylvain","robert",
                "adrien","aurelie","christophe","dominique","mohamed","walter", "mohamed");

        System.out.println("Filter : filtre : ");
        list.stream()
                .filter(p -> p.startsWith("a"))
                .forEach(System.out::println);



        System.out.println("Compter : count ");

        System.out.println("Le nombre de prenom dans ma liste est de : " + list.stream()
                .filter(p -> p.startsWith("a"))
                .count());

        System.out.println("Distinct : ");

        list.stream().distinct().forEach(System.out::println);

        System.out.println("limit : ");

        list.stream().limit(3).forEach(System.out::println);

        System.out.println("sort : ");

        list.stream().sorted().forEach(System.out::println);

        System.out.println("inverse sort : ");

        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        // manipulation avec Objet

        List<Employe> employees = new ArrayList<>();
        employees.add(new Employe(1L,Genre.FEMME,189,9000));
        employees.add(new Employe(2L,Genre.AUTRE,200,10000));
        employees.add(new Employe(3L,Genre.HOMME,190,7654));
        employees.add(new Employe(4L,Genre.FEMME,170,9000));
        employees.add(new Employe(5L,Genre.AUTRE,190,9800));


        double salaireTotal = employees
                .stream()
                .mapToDouble(e -> e.getSalaire())
                .sum();


        System.out.println("Le salaire total est de : " + salaireTotal);

        Optional<Employe> employe = employees.stream().filter(e -> e.getTaille()>=200).findFirst();

        if(employe.isPresent()){
            System.out.println(employe.get());
        }

        Employe employe1 = employees.stream().filter(e -> e.getTaille()>=170).findFirst().orElse(null);

        System.out.println(employe1);


    }


}
