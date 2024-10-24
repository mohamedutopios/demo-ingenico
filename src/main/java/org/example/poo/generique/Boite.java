package org.example.poo.generique;

public class Boite<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Boite<String> boite = new Boite<String>();
        boite.setValue("Earl Gray");
        System.out.println(boite.getValue());
        Boite<Integer> boite2 = new Boite<Integer>();
        boite2.setValue(2);
        System.out.println(boite2.getValue());

        Integer[] ints = {3,8,9,45};
        printArray(ints);
    }

    public static <E> void printArray(E[] array) {
        for (E e : array) {
            System.out.println(e);
        }
    }

}
