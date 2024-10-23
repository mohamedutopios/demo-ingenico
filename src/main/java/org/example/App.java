package org.example;

import org.example.array.Tableau;
import org.example.exercice.StructureIterative;
import org.example.exercice.VariablesConditions2;
import org.example.poo.Phone;
import org.example.poo.Product;
import org.example.string.ChaineCaractere;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        //Scanner scanner = new Scanner(System.in);
       // Variable.getVariable();
        //Operator.getOperator();
       // Operator.getExpressionType();
        //Operator.getOperatorAndComparaison();
       // Structure.getIfElse();
       // Structure.getIfElseIfElse();
        //Structure.getSwitch();
        //Structure2.getBoucleFor();
        //Structure2.getWhile();
        //Structure2.getBreakAndContinue();
       // ReadFromConsole.getReadWrite();
       // VariablesConditions.solutionExo32();

        //VariablesConditions2.solutionExo37(scanner);
        //VariablesConditions2.solutionExo36(scanner);
       // scanner.close();
        //ChaineCaractere.getMethodString();
        //ChaineCaractere.getComparaisonString();

        //StructureIterative.solutionExo51();
        //Tableau.getArray();

        Product product = new Product(1);

        Product product2 = new Product();

        Product product3 = new Product(2,"Iphone");

        System.out.println(product.getName());
        product.setName("Samsung");
        System.out.println(product.getName());
        System.out.println(product3);


        Phone phone = new Phone();
        Phone phone1 = new Phone(1,"Iphone15",1120);

        System.out.println("phone " + phone1);
        phone1.quiSuisJe();

    }
}
