package com.green.second.ch4;

import java.util.Arrays;

public class FlowEx32 {
    public static void main(String[] args) {
        int val = MyUtils.abs(10); // 10
        int val2 = MyUtils.abs(-10); // 10
        int val3 = MyUtils.abs(-20); // 20
        int val4 = MyUtils.abs(22); // 22
        System.out.println(val);
        System.out.println(val2);

        int rNum = MyUtils.randomVal(20, 50); // 20~50사이의 랜덤값 나올 수 있도록
        int rNum2 = MyUtils.randomVal(10, 33); // 20~50사이의 랜덤값 나올 수 있도록
        System.out.println(rNum);
        System.out.println(rNum2);

        int sum = MyUtils.sumFromTo(10, 30); // 10~30 모두 더한 값 리턴
        int sum2 = MyUtils.sumFromTo(12, 32); // 12~32 모두 더한 값 리턴
        System.out.println(sum);
        System.out.println(sum2);

        String gugudan3 = MyUtils.gugudan(5);
        /*
        3 x 1 = 3
        3 x 2 = 6 // 문자열로 리턴
         */
        System.out.println(gugudan3);
    }
}
class MyUtils{
    public static int abs(int val){
/*        if(val < 0){ return -val; } // 원본이 훼손되지 않습니다.
        return val;*/
        return val < 0 ? -val : val;
    }
    public static int randomVal(int min, int max){
        int ran = (int)(Math.random()*(max-min+1))+min;
        return ran;
    }
    public static int sumFromTo(int from, int to){
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }
    public static String gugudan1(int dan){
        String str = "";
        for (int i = 0; i < 9; i++) { // 객체생성이 엄청됩니다.
            str += String.format("%d x %d = %d\n", dan, i+1, dan*(i+1));
        }
        return str;
    }
    public static String gugudan(int dan){ // ***for문을 이용해 문자열 합치기를 쓸 떄 StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            sb.append(String.format("%d x %d = %d\n", dan, i, dan*i));
        }
        return sb.toString();
    }
    public static String gugudan2(int dan){
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        sb.append("2");
        sb.append("3");
        sb.append("4");
        sb.append("5");
        sb.append("6");
        return sb.toString();
    }
}