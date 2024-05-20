package Testing;

import SingletonPattern.Singleton;
import Testing.Test.Test;

public class SingletonPatternTesting implements Test {
    @Override
    public void test() {

        System.out.println("\nSingleton Pattern Calling : ");
        System.out.println(Singleton.getInstance().getEmployees());
        System.out.println(Singleton.getInstance().getEmployees());
        System.out.println(Singleton.getInstance().getEmployees());
    }
}

/*

The Singleton pattern is used when you need to ensure that a class has only one instance
and provides a global point of access to that instance

*/