package StructuralDesignPatterns.AdapterDesignPatterns;

public class TestArrayPattern {

    public static void main(String[] args){

        testClassPattern();

        testObjectPattern();
    }

    private static void testObjectPattern() {

        ObjectAdapterPattern objectAdapterPattern = new ObjectAdapterPattern();

        System.out.println(objectAdapterPattern.get3Volts().getVolts());

        System.out.println(objectAdapterPattern.get40Volts().getVolts());

        System.out.println(objectAdapterPattern.get120Volts().getVolts());
    }

    private static void testClassPattern() {

        ClassAdapterPattern classAdapterPattern = new ClassAdapterPattern();

        System.out.println(classAdapterPattern.get3Volts().getVolts());

        System.out.println(classAdapterPattern.get40Volts().getVolts());

        System.out.println(classAdapterPattern.get120Volts().getVolts());
    }
}
