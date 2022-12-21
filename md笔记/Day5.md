# Day5

### 1、方法定义

**完成特定功能的代码块**

**函数在java中称为方法**

![image-20221214194902146](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221214194902146.png)



```java
格式：
修饰符 返回值类型 方法名(参数类型 参数名1，参数类型 参数名2，参数类型 参数名3){
    方法体语句；
    return 返回值；
}

修饰符：目前就用public static，后面再讲其他的
返回值类型：就是功能结果的类型
方法名：符合命名规则即可
参数：
    实际参数：实际参与运算的
    形式参数：就是方法定义上的，用于接受实际参数的
方法体语句：就是完成功能的语句
return：返回方法的结果
```

![image-20221214200148579](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221214200148579.png)

![image-20221214201013239](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221214201013239.png)



![image-20221214201042025](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221214201042025.png)



**注意事项：**

```
方法不执行不调用
方法与方法是平级关系，不能嵌套定义
方法调用时候不用再传递数据类型
方法如果有明确的返回值，要用return返回
```

```java
class FunctionDemo4 {
    public static void main(String[] args) {
        //for循环输出图形
        for(int x = 0;x < 4;x++){
            for(int y = 0;y < 5;y++){
            System.out.print('*');
            }
            System.out.println();
        }
    }
}
```

### 2、方法重载

**在同一个类中允许定义多个同名的方法**

**方法名相同，参数列表不同，与返回值无关**

可以参数个数不同，也可以参数类型不同

![image-20221214211558663](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221214211558663.png)



![image-20221214211759415](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221214211759415.png)



**方法重载案例**

![image-20221214212139005](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221214212139005.png)



### 3、数组概述

![image-20221216212600662](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221216212600662.png)

**存储同一类型多个数据的集合**

![image-20221216212746345](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221216212746345.png)

![image-20221216213151030](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221216213151030.png)

**初始化方式：静态初始化和动态初始化**

![image-20221216213327515](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221216213327515.png)

```java
public class ArrayDemo {
    public static void main(String[] args) {
//        int[] a;//会报错，因为没有初始化
//        System.out.println(a);
        int[] a = new int[3];
        System.out.println(a); //[I@4554617c地址值
    }
}
```

![image-20221216213530531](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221216213530531.png)

![image-20221216213657402](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221216213657402.png)

**动态初始化默认值为0**



### 4、Java中的内存分配

![image-20221216213908055](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221216213908055.png)

后两个了解即可

![image-20221216214459022](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221216214459022.png)

栈内存在脱离作用域之后就释放

**不要同时静态和动态初始化**

```
int[] arr = new int[3]{1,2,3}
这样初始化是错误的
```



**常见问题：**

1、数组索引越界

2、空指针异常

![image-20221216220726756](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221216220726756.png)

p141