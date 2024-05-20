package Testing.Test;

import Testing.*;

public class TestFactory {
    public static Test getTestObject(DesignPatterns name) {
        Test testObj;
        if (name.equals(DesignPatterns.BUILDER_PATTERN))
            testObj = new BuilderPatternTesting();
        else if (name.equals(DesignPatterns.DECORATIVE_PATTERN))
            testObj = new DecorativePatternTesting();
        else if (name.equals(DesignPatterns.SINGLETON_PATTERN))
            testObj = new SingletonPatternTesting();
        else if (name.equals(DesignPatterns.FACTORY_PATTERN))
            testObj = new FactoryPatternTesting();
        else if (name.equals(DesignPatterns.STRATEGY_PATTERN))
            testObj = new StrategyPatternTesting();
        else if (name.equals(DesignPatterns.OBSERVER_PATTERN))
            testObj = new ObserverPatternTesting();
        else
            throw new IllegalArgumentException("DesignPattern Does not exist");

        return testObj;
    }
}
