package org.example.scope.package2;

import org.example.scope.package1.ClassA;

public class Demo {

    public static void main(String[] args) {

        ClassA classA = new ClassA();
        classA.doSomething();
        //classA.doSomethingElse();
        ClassB classB = new ClassB();
        classB.doSomething();
        classB.doSomethingClassB();
        classB.doSomethingElseClassB();
    }

}
