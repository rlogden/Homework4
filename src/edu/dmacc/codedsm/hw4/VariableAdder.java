package edu.dmacc.codedsm.hw4;

public class VariableAdder {

    final static int constantInteger = 5;
    static int instanceInteger = 10;

    public static void main(String[] args) {

        int methodInteger = 20;
        int result = constantInteger + instanceInteger + methodInteger;
        System.out.println(result);

    }

}
