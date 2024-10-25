package org.example.scope.package1;

import org.example.scope.package2.ClassB;
import org.example.scope.package2.ClassC;

public class Demo {

    public static void main(String[] args) {

        ClassA classA = new ClassA();
        classA.doSomething();
        classA.doSomethingElse();
        ClassB classb = new ClassB();
        classb.doSomething();
        classb.doSomethingElse();

    }


}
