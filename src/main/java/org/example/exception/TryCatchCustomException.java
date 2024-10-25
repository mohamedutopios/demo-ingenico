package org.example.exception;

public class TryCatchCustomException {
    public static void main(String[] args) {
        try{
            validateAge(12);
        }catch (CustomException e){
            System.out.println("Custom Exception : " + e.getMessage());
        }finally {
            System.out.println("Finally");
        }
    }

    static void validateAge(int age) throws CustomException {
        if(age<18){
            throw new CustomException("Majorité requise");
        }
    }

}
