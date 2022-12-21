package day3;
/*
一旦某一个else if成立，后面的不再判断
if(表达式){
	语句
}else if{
	语句
}...else{
	语句
}
*/

import java.util.Scanner;

public class IfDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("请输入你的成绩：");
        int score = sc.nextInt();
        if(score >= 90 && score <= 100){
            System.out.println("你的成绩是优");
        } else if (score >= 80 && score < 90) {
            System.out.println("你的成绩是好");
        }else if (score >= 70 && score < 80) {
            System.out.println("你的成绩是良");
        }else if (score >= 60 && score < 70) {
            System.out.println("你的成绩是及格");
        }else if (score < 60) {
            System.out.println("你的成绩是不及格");
        }else {
            System.out.println("输入成绩不合法");
        }
    }
}
