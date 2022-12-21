package day5;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //定义第一个数组，并给元素赋值
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("-----------");

        //定义第一个数组，并给元素赋值
        int[] arr1 = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("-----------");

        //定义第三个数组
        int[] arr2 = arr;  //相当于把arr的首地址给arr2
        arr2[0] = 100;
        arr2[1] = 200;
        System.out.println(arr2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("-----------");

    }
}
