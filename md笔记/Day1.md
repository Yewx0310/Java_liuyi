# Day1

Dos命令

![image-20221106223110236](C:\Users\YWX\AppData\Roaming\Typora\typora-user-images\image-20221106223110236.png)

del：只能删除文件，不能删除文件夹

删除文件夹用rd

带内容的文件夹，只能删除先文件夹内部的，在删除外部文件夹

如果要强制删除，则使用rd  /s，需要确认

rd /s /q 无需确认直接删除

![image-20221106233048927](C:\Users\YWX\AppData\Roaming\Typora\typora-user-images\image-20221106233048927.png)



James Gosling

JavaSE，JavaEE，JavaME



特点：面向对象，分布式，开源，跨平台，解释性，高性能，多线程，动态，安全性



跨平台特性：JVM 。java是跨平台的，JVM不是跨平台的

JRE：Java runtime environment，包括jvm和核心类，库等

JDK：Java development kit，开发环境，包含JRE，编译工具javac.exe



下载JDK

开发工具：notepad，notepad++，eclipse

db：database

bin：开发工具



Hello World：

首先定义一个类

class 类名

```
class HelloWorld{
	public static void main(String[] args){
		System.out.println("HelloWorld!");
	}
}
```

程序解析：

**1、**首先编写源代码文件，扩展名为java

**2、**在命令行模式中，输入javac命令对源码进行编译，生成字节码文件

**javac 源文件名.java**

**3、**编译完成后如果不报错，输入java命令对class字节码文件进行及解释运行，执行时不需要添加class扩展名

**java Demo**



常见问题：扩展名，非法字符（中英文问题），大小写问题，括号对应问题

环境变量：

（1）path环境变量，任意目录下都可以使用javac

将JDK的bin目录添加到path环境变量下，系统变量

（2） ![image-20221116193542455](C:\Users\YWX\AppData\Roaming\Typora\typora-user-images\image-20221116193542455.png)

classpath环境配置：任意路径下使用class文件 



notepad++