package com.company;




public class Main {
    public static void main(String[] args) {

        int san =144;

        sqrt(san);
    }

    public static UnaryOperator<Double> sqrt(int i) {
        UnaryOperator<Double> unaryOperator = () -> System.out.println(Math.sqrt(i));
        unaryOperator.method();

        return unaryOperator;
    }
}