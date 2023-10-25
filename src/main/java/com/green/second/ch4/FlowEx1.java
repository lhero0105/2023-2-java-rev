package com.green.second.ch4;

import java.util.Scanner;

public class FlowEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 하나 입력하세요 >");
        try {
            String input2 = scanner.nextLine();
            int input = Integer.parseInt(input2);
            System.out.printf("%d은(는) %s입니다.", input, input%2 == 0? "짝수":"홀수");
        }catch (Exception e){
            System.out.println("잘못된 입력입니다.");
        }
    }
}
