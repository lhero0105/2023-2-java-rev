package com.green.second.ch2;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "Va"; // 주솟값 + 주솟값 = 새로운 주솟값이 생성
        System.out.println(name);

        String title1 = "12" + (10 + 9);
        System.out.println(title1);

        String str1= new String("Hello");
        String str2= new String("Hello");
        System.out.println("str1 == str2 : " + str1 == str2);
        System.out.println("str1.equals(str2) : " + str1.equals(str2)); // equals는 오브젝트에게 상속받았습니다.

        System.out.println("-----------");
        Numbox b1 = new Numbox(10);
        Numbox b2 = new Numbox(14);

        int num1 = b1.getNum();
        int num2 = b2.getNum();
        System.out.println(num1 == num2);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println("b1 == b2 : " + (b1 == b2));
        System.out.println("b1.equals(b2) : " + b1.equals(b2)); // 값이 같으면 true 다르면 false 되도록
        System.out.println("str1.equals(str2) : " + b1.equals(str1));
    }
}

class  Numbox{
    private int num;

    public Numbox(int num){
        this.num = num;
    }
/*    public void setNum(int num){
        this.num = num;
    }*/
    public int getNum(){
        return num;
    }
    @Override
    public String toString(){
        return String.format("num : %d",num);
    }
    @Override
    public boolean equals(Object obj){
        if( !(obj instanceof Numbox) ) {
            return false;
        }
        Numbox nb = (Numbox) obj;
        return num == nb.getNum(); // nb.getnum()
    }
}