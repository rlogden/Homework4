package edu.dmacc.codedsm.hw4;

public class VariableAdder {

    final int CONSTANT_INTEGER = 5;
    int instanceInteger = 10;

    public static void main(String[] args) {

        VariableAdder a = new VariableAdder();
        int methodInteger = 20;
        int result = a.CONSTANT_INTEGER + a.instanceInteger + methodInteger;
        System.out.println(result);

    }

}
