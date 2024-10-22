package org.example.array;

public class Tableau {

    public static void getArray() {

        int[] tab;
        int tab2[] = new int[60];
        tab = new int[10];
        String[] tab3 = new String[10];
        int[] tab4 = {1,5,8,9};

        int[][] matrice = {{6,8,9,5},{9,4,6,3}};
        int[][] matrice3 = new int[89][90];

        System.out.println("Tableau tab4  : ");
        for (int i = 0; i < tab4.length ; i++) {
            System.out.println(tab4[i]);
        }

        for (int i = 0; i < tab.length ; i++) {
            tab[i] = i+1;
        }

        System.out.println("Tableau tab rempli : ");

        for (int val : tab) {
            System.out.println(val);
        }

    }
}
