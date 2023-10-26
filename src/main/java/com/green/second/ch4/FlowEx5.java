package com.green.second.ch4;

public class FlowEx5 {
    public static void main(String[] args) {
        ScoreBosOpt sbo = new ScoreBosOpt();
        sbo.setScore(100);

        ScoreBosOpt sbo2 = new ScoreBosOpt();
        sbo2.setScore(72);
        // score값이 90점보다 같거나 크면 A학점 리턴
        // score값이 80점보다 같거나 크면 B학점 리턴
        // 1의 자리수가 8이상이면 +, 3이하이면 -, 나머지는 0
        // 나머지 C학점 리턴

        // 예를들어 92점 > A-, 94점 > A0, 98점 > A+
        //         82점 > B-, 86점 > B0, 89점 > B+
        //         75 or 79 or 71 > C

        sbo.setScore(100);
        sbo2.setScore(95);
        String grade1 = sbo.getGrage();
        String grade2 = sbo2.getGrage();
        System.out.println(grade1);
        System.out.println(grade2);
    }
}

class ScoreBosOpt{
    private int score;
    public void setScore(int score){
        this.score = score;
    }

    public String getGrage() {
        String grade = "C";
        String opt = "";
        if(score > 100 || score < 0){
            return "잘못입력!!!";
        }

        if(score >= 90){
            grade = "A";
        }else if(score >= 80){
            grade = "B";
        }

        if(score > 80){
            if (score % 10 >= 8) {
                opt = "+";
            } else if (score % 10 <= 2) {
                opt = "-";
            }else if(score % 10 == 0){
                opt = "+";
            }
        }
        return grade + opt;
    }
    public String getGrage2(){
        if(score == 100){ return "A+"; }
        else if(score < 80){ return "C"; }
        //80~90
        String grade = "A";
        if(score < 90){
            grade = "B";
        }

        String opt = "0";
        int modVal = score % 10;
        if(modVal >= 8){ opt = "+"; }
        else if(modVal <= 3){ opt = "-"; }

        return grade + opt;
    }
}