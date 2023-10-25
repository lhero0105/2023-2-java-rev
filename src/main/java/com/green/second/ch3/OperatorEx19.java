package com.green.second.ch3;

import java.util.Arrays;

public class OperatorEx19 {
    public static void main(String[] args) {
        int n1 = 13, n2 = 8;

        System.out.println("n1 / n2 = " + (n1 / n2));
        System.out.println("n1 % n2 = " + (n1 % n2));

        System.out.println(n1%10); // 끝자리 수 구하는 법


        int rVal = (int)(Math.random()*9)+1; // 1~9
        System.out.printf("%d는(은) %s입니다.\n", rVal, (rVal%2)==0 ? "짝수" : "홀수" );
        System.out.println("---------------------------");
        // 중복제거
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int rIdx = (int)(Math.random()*10);
            arr[i] = rIdx;
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------------");
        // 오름차순
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] < arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
