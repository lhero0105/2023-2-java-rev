package com.green.second.ch2;

public class CastingEx1 {
    public static void main(String[] args) {
        byte v1 = 10;
        short v2 = 20;
        int v3 = 30;
        long v4 = 40; // 8byte
        float v5 = 50.1f; //8byte
        double v6 = 50.1;

        v2 = v1; v3 = v2; v4 = v3;//...
        v1 = (byte) v6;//...

        String str = "안녕" + v6; // +밖에 사용할 수 없습니다.
        System.out.println(str);
    }
}
