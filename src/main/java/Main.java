import Testing.Test.DesignPatterns;
import Testing.Test.Test;
import Testing.Test.TestFactory;

public class Main {
    public static void main(String[] args) {

        Test test;

        test = TestFactory.getTestObject(DesignPatterns.BUILDER_PATTERN);
        test.test();

        test = TestFactory.getTestObject(DesignPatterns.DECORATIVE_PATTERN);
        test.test();

        test = TestFactory.getTestObject(DesignPatterns.SINGLETON_PATTERN);
        test.test();

        test = TestFactory.getTestObject(DesignPatterns.FACTORY_PATTERN);
        test.test();

        test = TestFactory.getTestObject(DesignPatterns.STRATEGY_PATTERN);
        test.test();

        test = TestFactory.getTestObject(DesignPatterns.OBSERVER_PATTERN);
        test.test();


    }
}

