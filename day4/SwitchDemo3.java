package day4;
/*
模拟单项选择题
 */

import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args) {
        System.out.println("以下几个人你最喜欢谁？");
        System.out.println("65 林青霞");
        System.out.println("66 刘意");
        System.out.println("67 刘德华");
        System.out.println("68 王力宏");

        //键盘录入
        System.out.println("请输入你喜欢人的编号：");
        Scanner sc = new Scanner(System.in);
        int choiceNum = sc.nextInt();

        //强制转换
        char choice = (char)choiceNum;

        switch (choice){
            case 'A':
                System.out.println("选择正确");
                break;
            default:
                System.out.println("选择错误");
                break;
        }
    }
}
