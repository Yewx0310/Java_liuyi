package day4;
/*
根据键盘录入字符串，判断是否满足要求
 */
import java.util.Scanner;

public class SwitchDemo4 {
    public static void main(String[] args) {
        //录入数据

        Scanner sc = new Scanner(System.in);
        System.out.println("输入你要判断的字符串：");
        String s = sc.nextLine();

        switch (s){
            case "hello":
                System.out.println("你输入的是hello");
                break;
            case "world":
                System.out.println("你输入的是world");
                break;
            default:
                System.out.println("无效输入");
                break;
        }
    }
}
