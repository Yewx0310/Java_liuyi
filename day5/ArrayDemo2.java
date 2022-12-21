package day5;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //给数组元素赋值
        arr[0] = 100;
        arr[2] = 200;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
