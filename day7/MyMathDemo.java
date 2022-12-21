package day7;

import java.util.Scanner;

class MyMath{
    //加法
    public int sum(int a,int b){
        return a + b;
    }

    //减法
    public int min(int a, int b){
        return a - b;
    }

    //乘法
    public int multi(int a ,int b){
        return a * b;
    }

    public int divide(int a , int b){
        return a / b;
    }
}

public class MyMathDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        MyMath math = new MyMath();
        int sum = math.sum(a,b);
        int min = math.min(a,b);
        int mul = math.multi(a,b);
        int div = math.divide(a,b);
        System.out.println(sum);
    }
}
