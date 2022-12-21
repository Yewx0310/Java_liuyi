package day5;
/*
存储同一种数据类型的多个元素的容器

数据类型[] 名称
数据类型 名称[]

int[] a;定义一个int类型的数组a变量
int a[];定义一个int类型的a数组变量

效果是一样的，推荐使用第一种

如何初始化？为数组开辟内存空间，并为数组元素赋值

动态初始化和静态初始化

 */
public class ArrayDemo1 {
    public static void main(String[] args) {
//        int[] a;//会报错，因为没有初始化
//        System.out.println(a);
        int[] arr = new int[3];
        System.out.println(arr);  //[I@4554617c地址值

        System.out.println(arr[0]);

    }
}
