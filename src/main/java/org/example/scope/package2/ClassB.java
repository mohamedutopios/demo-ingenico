package org.example.scope.package2;

import org.example.scope.package1.ClassA;

public class ClassB extends ClassA {

    void doSomethingClassB(){
        System.out.println("ClassB doSomethingClassB");
    }
    protected void doSomethingElseClassB(){
        System.out.println("ClassB doSomethingElseClassB");
    }



}
