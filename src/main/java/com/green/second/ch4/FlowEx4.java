package com.green.second.ch4;

public class FlowEx4 {
    public static void main(String[] args) {
        ScoreBox sb1 = new ScoreBox(1000);
        ScoreBox sb2 = new ScoreBox(71);

        sb1.printGarde();
        sb2.printGarde();
        // score값이 90점보다 같거나 크면 A학점 출력
        // score값이 80점보다 같거나 크면 B학점 출력
        // score값이 70점보다 같거나 크면 C학점 출력
        // 나머지는 D학점
    }
}
class ScoreBox{
    private int score;
    public ScoreBox(int score){
        this.score = score;
    }
    public void printGarde(){
        char grade = 'D';
        if (score > 100 || score < 0){
            System.out.println("잘못입력!!!");
            return;
        }
        if(score >= 90){ grade = 'A'; }
        else if(score >= 80){ grade = 'B'; }
        else if(score >= 70){ grade = 'C'; }
        System.out.printf("학점 : %c", grade);
    }
}