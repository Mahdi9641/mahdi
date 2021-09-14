package com.PrimitiveParameters;

public class PrimitiveParameters {
    private static int b;
    private static int a;

    public static void main(String[] args) {
        go();
    }

    private static void go() {
        int x = 3;
        int y = 2;
        System.out.println("int x go." +x +"int y go." +y);
        falseswape(x,y);
        System.out.println("int x go." +x +"int y go." +y);
        falseswape(x,y);
        System.out.println("int x go." +x +"int y go." +y);

    }

    private static void falseswape(int x, int y) {
        System.out.println("in method falseSwap. x: " + x + " y: " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("in method falseSwap. x: " + x + " y: " + y);
    }


    private static void moreParameters(int x, int y) {
        System.out.println("in method moreParameters. a: " + a + " b: " + b);
        a = a*b;
        b = 12;
        System.out.println("in method moreParameters. a: " + a + " b: " + b);
        falseswape(b,a);
        System.out.println("in method moreParameters. a: " + a + " b: " + b);
    }

}
