package org.example.exception;

import java.util.Arrays;

public class TryCatchMultiple {
    public static void main(String[] args) {
       /* try {
           int result = 67/0;
           System.out.println(result);
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(numbers[9] + " ");
        }catch (ArithmeticException e) {
            System.out.println("arithmetic " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index en dehors du tableau : " + e.getMessage());
        }finally {
            System.out.println("Finally");
        }
*/

         try {
           int result = 67/0;
           System.out.println(result);
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(numbers[9] + " ");
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Exception : " + e.getMessage());
        }finally {
            System.out.println("Finally");
        }

    }


}
