package org.example.exception;

public class TryCatchFinallyExample {

    public static void main(String[] args) {

        try{
            int result = 1 / 0;
            System.out.println("Result : " + result);

        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception : " + e.getMessage());
        }finally {
            System.out.println("Finally");
        }

    }

}
