# Day6

### 1、二维数组

### 2、

![image-20221219205336038](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221219205336038.png)

```java
public static int array2Sum(int[][] arr){
        int sum = 0;
        for(int x=0;x<arr.length;x++){
            for(int y=0;y<arr[x].length;y++){
                sum += arr[x][y];
            }
        }
        return sum;
    }
```



打印杨辉三角，行数由键盘录入确定

![image-20221219205940506](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221219205940506.png)

```java
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

```



### 3、参数传递

**基本类型传递的是值**：形式参数改变对实参无影响

**引用类型给地址值**：形式参数改变直接影响实参数



### 4、实例

![image-20221219213607766](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221219213607766.png)



![image-20221219213928615](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221219213928615.png)



### 5、面向对象

![image-20221219220345221](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221219220345221.png)

**面向对象思想：**

![image-20221219220513461](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221219220513461.png)



![image-20221219221421796](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221219221421796.png)

**面型对象：先找类，再找类里的东西，类间关系**

![image-20221219221655942](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221219221655942.png)



**大象装进冰箱**

**类：**

​		名词提取法，UML ，**大象，冰箱，Demo**

**每个类的操作：**

​		**大象**：进去

​		**冰箱**：开门关门

​		**Demo**：main方法

**类间关系：**

​		Demo中使用大象和冰箱类的功能

![image-20221219222058999](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221219222058999.png)



描述事物：**属性和行为**

![image-20221219223211602](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221219223211602.png)

![image-20221219223433397](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221219223433397.png)

```
/*
在一个java文件中写两个类，一个基本的类，一个测试类
注意：文件名与测试类一致

如何使用类呢？
    创建对象使用
    格式：类名 对象名 = new 类名（）；
 */
```

**面向对象内存图**

单个对象

![image-20221220211052196](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221220211052196.png)



两个对象

![image-20221220211235916](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221220211235916.png)



### 6、总结

二维数组：

```
数据类型[][] 数组名 = new 数据类型[m][n]
数据类型[][] 数组名 = new 数据类型[m][]
数据类型[][] 数组名 = new 数据类型[][]{{},{},{},...}
数据类型[][] 数组名 = {{},{},{},...}
```

面向对象









