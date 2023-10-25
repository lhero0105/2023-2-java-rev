package com.green.second.ch2;

public class OverUnderFlow {
    public static void main(String[] args) {
        short s1 = 128;
        byte b1 = (byte) s1;
        System.out.printf("b1 : %d\n", b1);

        short s2 = -129;
        byte b2 = 0;
        // 오버플로우 언더플로우 시 체크
        if(Byte.MAX_VALUE >= s2 && Byte.MIN_VALUE <= s2){ //Bite클래스의 static final 인 MAX_VALUE은 정수일 것이다.
            b2 = (byte) s2;
        }
        System.out.printf("b2 : %d\n", b2);
    }
}
