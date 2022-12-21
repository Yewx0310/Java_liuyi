package day4;
/*
键盘录入月份，转换为对应的季节
 */

import java.util.Scanner;

public class SwithcDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份：");
        int month = sc.nextInt();

        switch (month){
            case 1:
                System.out.println("春季");
                break;
            case 2:
                System.out.println("春季");
                break;
            case 3:
                System.out.println("春季");
                break;
            case 4:
                System.out.println("夏季");
                break;
            case 5:
                System.out.println("夏季");
                break;
            case 6:
                System.out.println("夏季");
                break;
            case 7:
                System.out.println("秋季");
                break;
            case 8:
                System.out.println("秋季");
                break;
            case 9:
                System.out.println("秋季");
                break;
            case 10:
                System.out.println("冬季");
                break;
            case 11:
                System.out.println("冬季");
                break;
            case 12:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入月份不合法");
        }
    }
}
