package com.green.second.ch3;

public class OperatorEx24 {
    public static void main(String[] args) {
        System.out.println(true && true && 1 < 0);
        System.out.println(false && true && (10 / 0) == 0);

        System.out.println("------------------");
        System.out.println(true || true || false);
        System.out.println(false || true || false);
        System.out.println(true || false || (10 / 0) == 0);
    }
}
