package day5;
/*
二维数组遍历

外循环控制的是二维数组的长度，实际上是一维数组的个数
内循环控制的是一维数组的长度，实际上是一维数组中元素的个数
 */
public class Array2Test1 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        printArray2(arr);
        //arr[0]代表第一个数组
        for(int x=0;x<3;x++){
            for(int y=0;y<arr[x].length;y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
    }

    public static void printArray2(int[][] a){
        for(int x=0;x<3;x++){
            for(int y=0;y<a[x].length;y++){
                System.out.print(a[x][y]+" ");
            }
            System.out.println();
        }
    }
}
