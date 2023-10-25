package com.green.second.ch3;

public class OperatorEx18 {
    public static void main(String[] args) {
        float f1 = 15.0f, f2 = 15.001f, f3 = 15.5f, f4 = 15.9f;

        //ceil (올림) > 리턴타입 double // 페이징처리 할 때 사용합니다
        System.out.printf("ceil(%f) >> %f\n", f1, Math.ceil(f1));
        System.out.printf("ceil(%f) >> %f\n", f2, Math.ceil(f2));
        //floor (내림) > double
        System.out.printf("floor(%f) >> %f\n", f4, Math.floor(f4));
        //round (반올림) > long 얘만 그렇습니다.
        System.out.printf("round(%f) >> %d\n", f3, Math.round(f3));
    }
}
