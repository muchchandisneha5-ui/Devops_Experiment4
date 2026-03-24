package org.example;

public class App {
    public static void main(String [] args){
        System.out.println("Hello maven");
        System.out.println("This is the real world example");
        int a=5;
        int b=10;
        System.out.println("sum of "+a+" and "+b+" is"+sum(a,b));
    }
    public static int sum(int x, int y){
        return x+y;
    }
}
