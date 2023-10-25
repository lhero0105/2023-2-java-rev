package com.green.second.ch1;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 30;
        int tmp = 0;
        tmp = x;
        x = y;
        y = tmp;
        System.out.printf("x: %d, y: %d\n",x ,y); // f : format d: DECIMAL(정수)
    }
}
