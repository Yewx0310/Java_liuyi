# Day4

### 1、选择结构：switch语句

![image-20221123152303509](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221123152303509.png)

**取值有限定：**byte，short，int，char，枚举，字符串

![image-20221124211235343](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221124211235343.png)

可以，不可以，JDK7后可以

```java
switch(表达式){
	case 值1：
		语句；
		break；
	case 值2：
		语句；
		break；
	case 值3：
		语句；
		break；
	default：
		语句；
		break；
}
```

break表示终止，当所有值与表达式都不匹配时候，就执行default

![image-20221124211548714](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221124211548714.png)

```java
/*
使用switch注意事项
case后面的值只能是常量
case标签不能重复
default可以省略但是不建议，除非case可以把所有情况覆盖
避免case穿透，不要省略break
default可以在任意位置，但是建议在最后
switch结束条件：遇到break，执行到末尾
*/
```

录入字符串：

```
String s = sc.nextLine();
```

if语句与switch区别：

if：**针对布尔类型，范围**，针对几个常量的判断

switch：针对几个常量的判断



### 2、For循环

需求：输出10次hello world！

```java
public class ForDemo {
    public static void main(String[] args) {
        for(int i = 1;i <=  10;i++){
            System.out.println("Hello World!");
        }
    }
}
```

![image-20221130224852504](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221130224852504.png)

**Tips：从0开始，最后一个是小于，从1开始，最后一个是小于等于**



### 3、while循环

![image-20221201215840339](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221201215840339.png)



**For循环与while循环的区别：**

```java
package day4;
/*
for与while的区别
如果明确循环范围，用for循环合适
如果不明确范围，用while循环

 */
public class WhileDemo4 {
    public static void main(String[] args) {
        for(int x = 1; x <= 10;x++){
            System.out.println("学习JAVA！");
        }
        //x只在for循环内部存在，一旦跳出循环就不能在使用
        //例如：System.out.println(x);就会报错
        //但是while仍然可以使用

        int y = 1;
        while(y <= 10){
            System.out.println("Learn JAVA!");
            y++;
        }
        //这里是可以继续访问的
        System.out.println(y);
    }
}

```



### 4、do ... while循环

![image-20221201222137031](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221201222137031.png)

不论如何先做一次



### 5、三种循环的区别

do ...while至少执行一次循环体语句

while和for有可能一次都不执行

**使用：优先考虑for，其次考虑while，最后再do ...while**



### 6、死循环注意事项

```java
/*注意死循环：
        注意控制条件语句
        两种简单的死循环格式
*/
```



### 7、输出九九乘法表

```java
package day4;
/*
输出九九乘法表

\r :回车
\t: table
\n: 换行
 */
public class ForFoeDemo3 {
    public static void main(String[] args) {
        for(int x = 0;x < 9;x++){
            for(int y =0;y <= x;y++){
                System.out.print('*');
            }
            System.out.println();
        }

        //为了方便，数据改成从1开始

        for(int i = 1;i <= 9;i++){
            for(int j =1;j <= i;j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}

```



### 8、跳转控制语句

**goto是保留字，现在不能用**

JAVA提供了break，countine，return实现控制语句跳转和中断

![image-20221213145527775](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221213145527775.png)

**Break：**

跳过整个循环

![image-20221213145551936](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221213145551936.png)



跳出多层循环：

**带标签的语句：**格式：标签名：语句

```java
  wc:for(int x = 0;x < 4;x++){
            nc:for(int y = 0;y < 3;y++){
```

**Countinue：**

跳过本次循环

![image-20221213150621964](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221213150621964.png)

**Return：**

用于结束方法

一旦遇到return程序就不再往后执行

![image-20221214163500836](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221214163500836.png)

```java
package day4;
/*
不是结束循环的，是结束方法的
 */
public class ReturnDemo {
    public static void main(String[] args) {
        for(int x = 0;x < 10;x++){
            if(x == 2){
                System.out.println("退出");
                return;//跳出整个方法，这里就是跳出main，输出结果只有0，1，退出
            }
            System.out.println(x);
        }
        System.out.println("over!");
    }
}

```



![image-20221214165138372](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221214165138372.png)



### 9、总结

（1）switch：

```java
switch（表达式）：
	case1：
		语句体；
		break；
	case2：
		语句体；
		break；
	...
	default:
		语句体；
		break；
```



![image-20221214171630023](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221214171630023.png)

![image-20221214171650786](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221214171650786.png)

![image-20221214171713041](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221214171713041.png)

![image-20221214194619476](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221214194619476.png)

![image-20221214194700752](C:\Users\Ywx\AppData\Roaming\Typora\typora-user-images\image-20221214194700752.png)