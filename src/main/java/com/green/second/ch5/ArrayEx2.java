package com.green.second.ch5;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr = MyArray.make(5);
        System.out.println(arr.length);

        MyArray.inputStart(arr, 10); // arr배열의 0번방에 8값부터
        // [1] = 9, [2] = 10
        System.out.println(Arrays.toString(arr));

        int[] arr2 = MyArray.mapSum(arr, 3);
        // 기존배열의 각방의 값을 +3한 새로운 배열을 리턴

        int[] arr3 = MyArray.mapSum(arr, 5);
        // 기존배열의 각방의 값을 +5한 새로운 배열을 리턴
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        int sum = MyArray.sum(arr2); // 배열 각 방의 값을 모두 더한 값 리턴
        System.out.println(sum);
        int[] arr4 = { 10, 2, 1, 9, 13};
        int min = MyArray.min(arr4); // 배열안에서 가장 작은 값을 리턴할 수 있도록
        System.out.println(min);

        MyArray.shuffle(arr4);
        System.out.println(Arrays.toString(arr4));

    }
}
class MyArray{
    public static int[] make(int num){
        return new int[num];
    }
    public static void inputStart2(final int[] arr,final int num){
        System.out.printf("[0] = %d", num);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", [%d] = %d", i, num+i );
        }
    }
    public static void inputStart(final int[] arr,final int startNum){
        int num = startNum;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num ++;
        }
    }
    public static int[] mapSum(int[] arr, int plus){
        int[] tmpArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmpArr[i] = arr[i] + plus;
        }
        return tmpArr;
    }
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int min(int[] arr){
        if(arr == null || arr.length == 0){return 0;} // 예외처리
        int min = 100000000;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void shuffle(int[] arr){
        int rIdx = 0;
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            rIdx = (int)(Math.random()*arr.length);
            if(i == rIdx){continue;}
            tmp = arr[i];
            arr[i] = arr[rIdx];
            arr[rIdx] = tmp;
        }
    }
}