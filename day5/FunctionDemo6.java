package day5;
/*
输出nn乘法表
 */
import java.util.Scanner;

class FunctionDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int n = sc.nextInt();
        printNN(n);
    }

    public static void printNN(int n){
        for(int x =1;x <= n;x++){
            for(int y = 1;y <= x;y++){
                System.out.print(y+"*"+x+"="+x*y+"\t");
            }
            System.out.println();
        }

    }
}
