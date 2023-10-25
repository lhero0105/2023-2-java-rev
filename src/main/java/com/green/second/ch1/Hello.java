package com.green.second.ch1;

public class Hello {
    public static void main(String[] args) {
    String str = "Hello";
    /*
    HelloHelloHello
     */
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s",str); // out가 래터런스변수라 그 주솟값을 담습니다.
        }// 추가로 out은 final입니다.
    }
}
