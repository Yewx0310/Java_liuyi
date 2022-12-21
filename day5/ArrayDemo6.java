package day5;

/*
二维数组
格式： int[][] a = new int[m][n];
      int[] a[]

动态初始化
 */
public class ArrayDemo6 {
    public static void main(String[] args) {
        int[][] a = new int[3][2];
        System.out.println(a); //输出地址[[I@4554617c
        System.out.println(a[0]);  //输出地址[I@74a14482
        System.out.println(a[0][1]); //输出0

        int[][] b = new int[3][];
        b[0] = new int[2];
        b[1] = new int[3];
        b[2] = new int[1];
        System.out.println(b[1]);
        System.out.println(b[1][2]);
    }
}
