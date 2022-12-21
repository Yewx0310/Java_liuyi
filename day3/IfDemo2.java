package day3;
import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        //判断两个数是否相等
        int x = 100;
        int y = 200;
        if (x == y){
            System.out.println("x = y");
        }else{
            System.out.println("x != y");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a = sc.nextInt();
        System.out.println("请再输入一个数字：");
        int b = sc.nextInt();
        System.out.println("你输入的数中较大的一个是：");
        if (a > b ){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        if((a % 2 )== 0){
            System.out.println("a是偶数");
        }else{
            System.out.println("a是奇数");
        }
    }
}
