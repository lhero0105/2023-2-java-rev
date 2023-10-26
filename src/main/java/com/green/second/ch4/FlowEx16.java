package com.green.second.ch4;

public class FlowEx16 {
    public static void main(String[] args) {
        String line = MyStar.star(6) ; // *****
        String line2 = MyStar.star(4); // ******
        System.out.print(line);
        System.out.print(line2);
        String line3 = MyStar.multiStar(5);
        System.out.println(line3);
        String line4 = MyStar.triangleStar(5);
        System.out.println(line4);
        //*
        //**
        //***
        //****
        //*****
    }
}
class MyStar{
    public static String star(int num){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append("*");
        }
        sb.append("\n");
        return sb.toString();
    }
    public static String multiStar(int num){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(star(num));
        }
        return sb.toString();
    }
    public static String triangleStar(int num){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sb.append(star(i));
        }
        return sb.toString();
    }
}