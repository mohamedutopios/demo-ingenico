package org.example.exception;

public class TryCatchFinaly2 {

    public static void main(String[] args) {

        try{
            int[] numbers = {1,2,3,4,5};
            System.out.println(numbers[9]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index en dehors du tableau : " + e.getMessage());
        }finally {
            System.out.println("Finally");
        }

    }
}
