package com.green.second.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("아무값 입력 >>");
        String val = scan.nextLine(); // while문이 입력할 때 까지 돌아가는 중 입니다.

        int intVal = MyUtils.parseStringToInt(val);
        //int intVal = Integer.parseInt(val);
        System.out.println(intVal + intVal);

    }
}

class MyUtils{
    public static int parseStringToInt(String val){ // a12a같이 섞였을 때 에러를 잡아줍니다.
        try {
            return Integer.parseInt(val);
        } catch (Exception e){
            return -1;
        }
    }
}