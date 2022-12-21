package day5;

public class ArrayTest1 {
    public static void main(String[] args) {
        //定义一个数据
        int number = 123456;

        //定义一个数组
        int[] arr = new int[8];

        //把每一位存到数组当中
        int index = 0;
        while(number > 0){
            arr[index] = (number % 10 + 5) % 10;
            index++;
            number /= 10;
        }
        //交换第一个和最后一个数
        change(arr,index);

        //输出数据
        for(int x = 0;x < index ;x++){
            System.out.print(arr[x]);
        }
        System.out.println();
    }
    public static void change(int[] arr,int index){
        int temp =arr[0];
        //这里不要直接使用arr[arr.length-1],因为有可能数组长度没有8位
        arr[0] = arr[index-1];
        arr[index-1 ] = temp;
    }
}
