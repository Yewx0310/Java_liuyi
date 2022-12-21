package day5;
/*
数据类型[][] 变量名 = new 数据类型[][]{{},{},{}...}

简化格式：数据类型[][] 变量名 = {{},{},{}...}
 */
public class ArrayDemo7 {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1,2,3},{3,4},{5}};
        System.out.println(a[0][1]);

        int[][] b = {{1,2,3},{4}};
        System.out.println(b[0][0]);
    }
}
