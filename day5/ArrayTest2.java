package day5;
import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小于8位的数字：");

        int number = sc.nextInt();
        //写功能实现把数据加密
        String s = jiaMi(number);
        System.out.println(s);
    }
    /*
    需求：写功能实现把数据加密
    明确：（1）参数列表：int  （2）返回值类型String做一个字符串拼接
     */
    public static String jiaMi(int number) {
        //定义数组
        int[] arr = new int[8];

        //将数据存入数组当中
        int index = 0;
        while (number > 0) {
            arr[index] = (number % 10 + 5) % 10;
            index++;
            number /= 10;
        }
        int temp = arr[0];
        arr[0] = arr[index - 1];
        arr[index-1] = temp;

        //定义一个空字符串
        String s = "";

        for(int x = 0;x < index;x++){
            s += arr[x];
        }
        return s;
    }
}
