package org.example;

import org.example.exercices.VariablesConditions;
import org.example.exercices.VariablesConditions2;
import org.example.operator.Operator;
import org.example.readFromConsole.ReadFromConsole;
import org.example.structure.Structure;
import org.example.structure.Structure2;
import org.example.variables.Variable;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
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

        VariablesConditions2.solutionExo37(scanner);
        VariablesConditions2.solutionExo36(scanner);
        scanner.close();



    }
}
