package day5;
/*
按照输入行列数打印※
 */
import java.util.Scanner;
class FunctionDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数：");
        int m = sc.nextInt();
        System.out.println("请输入列数：");
        int n = sc.nextInt();
        draw(m,n);
    }

    public static void draw(int m , int n){
        for(int x = 0;x < m;x++){
            for(int y = 0;y < n;y++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
