package day5;
/*
静态初始化
格式：数据类型[] 数组名 = new 数据类型[]{元素1，元素2...}
简化：数据类型[] 数组名 = {元素1，元素2...}
 */
public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(arr);
        System.out.println(arr[1]);

        int[] arr1 = {1,2,3};
        System.out.println(arr1[0]);
    }
}
