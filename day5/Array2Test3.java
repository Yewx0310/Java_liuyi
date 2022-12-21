package day5;
/*
打印杨辉三角，行数由键盘录入确定
 */
import java.util.Scanner;

public class Array2Test3 {
    public static void main(String[] args) {
        System.out.println("请输入行数：");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        int[][] arr = new int[row][row];

        //给第一列和最后一列赋值
        for(int x=0;x<arr.length;x++){
            arr[x][0] = 1;
            arr[x][x] = 1;
        }

        for(int x=2;x < arr.length;x++){
            //注意这里y从1开始，以及y小于等于x-1
            for(int y = 1;y <= x-1;y++){
                arr[x][y] = arr[x-1][y] + arr[x-1][y-1];
            }
        }

        //遍历一下这个数组,注意不要遍历全部，这里与99乘法表类似
        for(int x = 0;x<arr.length;x++){
            for(int y=0;y <= x;y++){
                System.out.print(arr[x][y]+"\t");
            }
            System.out.println();
        }
    }
}
