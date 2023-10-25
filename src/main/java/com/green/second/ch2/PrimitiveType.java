package com.green.second.ch2;

public class PrimitiveType {
    public static void main(String[] args) {
        boolean b = true;
        b = false;

        byte n2 = 100;
        int n1 = 100;
        n2 = (byte) n1;
        float f = 12.3f; // 12.3은 더블타입입니다

        double d = 12.3;
        float f3 = (float) d;

        long lng = 1000000000000000000l;

        int n3 = 100000;
        long lng2 = n3;
    }
}
