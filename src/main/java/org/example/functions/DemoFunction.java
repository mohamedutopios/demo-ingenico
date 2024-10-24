package org.example.functions;

public class DemoFunction {

    public static void main(String[] args) {

        String[] tabs = new String[5];
        double result = sum(tabs, 65,87,90,45,32,5.7,89);
        System.out.println(result);
    }

    public static Integer sum(int a, int b) {
        return a + b;
    }

    public static Integer sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(String[] val, double...doubles) {
        double result = 0;
        for (double d : doubles) {
            result += d;
        }
        return result;
    }

}
