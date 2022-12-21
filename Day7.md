# Day7

### 1、成员变量和局部变量的区别

**位置不同：**

​		成员变量在类方法中

​		局部变量在方法定义中或方法声明上

**内存位置不同：**

​		成员变量在堆内存

​		局部变量在栈内存

**生命周期不同：**

​		成员变量：随着对象创建而存在，随着对象消失而消失

​		局部变量：随着方法调用而存在，随着方法消失而消失

**初始值：**

​		成员变量：有默认初始值

​		局部变量：无初始值

局部变量和成员变量名称可以一致，在方法中按照就近原则是有



### 2、形式参数的问题

基本类型：形式参数改变不影响实际参数

引用类型：形式参数改变直接影响实际参数

**引用类型：类，接口和数组**



### 3、匿名对象

![image-20221220213838747](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221220213838747.png)

```
匿名对象：没有名字的对象

应用场景：调用方法（只调用一次）
        多次调用不合适，匿名对象调用完就是垃圾，可以被回收
        new Student1().show();
        
        可以作为实际参数传递
        new StudentDemo().method(new Student());
```



### 4、类的封装

```
可以给成员变量赋值非法的值，要先对数值进行判断，在哪里判断呢？
例如：s.age = -27;
```

![image-20221220215625659](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221220215625659.png)



![image-20221220215948059](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221220215948059.png)

强制要求不能直接使用成员变量：

java提供了一个关键字：**private**

注意：被private修饰的成员只能在本类中访问

**封装：隐藏对象的属性和实现细节，仅对外提供公共访问方式**



![image-20221220220329949](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221220220329949.png)



### 5、private关键字

![image-20221220220523623](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221220220523623.png)

![image-20221220221057185](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221220221057185.png)



### 6、this关键字

![image-20221220222444826](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221220222444826.png)



**this关键字代表当前类的对象名**

解决局部变量隐藏成员变量问题



### 7、构造方法

![image-20221220224417634](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221220224417634.png)

![image-20221220224536275](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221220224536275.png)

**构造方法的重载**

自己给出无参构造方法

![image-20221221142941679](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221221142941679.png)



类的组成：成员变量，成员方法，构造方法

  ![image-20221221143304391](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221221143304391.png)



![image-20221221143340487](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221221143340487.png)

![image-20221221144034964](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221221144034964.png)



### 8、类的初始化过程

构造方法：对类进行初始化

![image-20221221144818571](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221221144818571.png)

![image-20221221144753722](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221221144753722.png)



**变量什么时候定义为成员变量？**变量描述是类的属性，变量范围越小越好，因为可以及时回收

import必须出现在所有class前面

![image-20221221154153787](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221221154153787.png)



### 9、static关键字

静态变量可以被类名调用

![image-20221221160219459](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221221160219459.png)

内存图：

![image-20221221160632997](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221221160632997.png)



注意事项：

![image-20221221161101264](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221221161101264.png)



![image-20221221161357988](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221221161357988.png)

静态只能访问静态，非静态可以访问一切



### 10、静态变量和成员变量

![image-20221221161429880](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221221161429880.png)



### 11、main方法格式详解 

```java
public static void main(String[] args);
```

![image-20221221161708453](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221221161708453.png)

![image-20221221161857521](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221221161857521.png)



未看总结

