package day3;

import java.util.Scanner;

class OperatorDemo1{
    public static void main(String[] args) {
        int x = 3;
        double y = 4;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x*1.0/y);

        System.out.println(x%y);//取余
    }
}

//自增和自减
class OperatorDemo2{
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        //字符串拼接
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("x:"+x+","+"y:"+y);

        //单独使用
        x++;
        y--;
        System.out.println("x:"+x+","+"y:"+y);

        System.out.println("----------------");
        int a = 3;
        int b = 4;

//        int c = a++;
//        int d = b--;

        int c = ++a;
        int d = --b;

        System.out.println("a:"+a);//4,4
        System.out.println("b:"+b);//3,5
        System.out.println("c:"+c);//3,4
        System.out.println("d:"+d);//4,3

        int z = 4;
        int m = (z++)+(++z)+(z*10);
        //4+6+60
        //5,6
        System.out.println(m);
        System.out.println('a'+1+"hello");//98hello注意数据类型之间的转换
        System.out.println("hello"+'a'+1);//helloa1
    }
}

//一些小问题
class OperatorDemo3{
    public static void main(String[] args) {
        //short s = 1;
        //s = s + 1;
        //这里会报错，因为short参与运算会先转换成int，int相加再赋值给short可能会损失精度

        short s = 1;
        s += 1;
        System.out.println(s);
    }
}

//比较运算符
class OperatorDemo4{
    public static void main(String[] args) {
        int x=3,y=4,z=3;
        System.out.println(x==y);
        System.out.println(x==z);
    }
}

//逻辑运算符
class OperatorDemo5{
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        System.out.println((a>b)&(a>c));
        System.out.println((a>b)&(a<c));
        System.out.println((a<b)&(a>c));
        System.out.println((a<b)&(a<c));

        int x = 3;
        int y = 4;
        boolean b1 = (++x == 3) & (y++ == 4);
        boolean b2 = (++x == 3) && (y++ == 4);
        System.out.println(b1);
        System.out.println(b2);

    }
}

//位运算符
class OperatorDemo6{
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(3 & 4);
        System.out.println(3 | 4);
        System.out.println(3 ^ 4);
        System.out.println(~3);
    }
}

class Swap1{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //临时变量
        int c = a;
        a = b;
        b = c;
        System.out.println("a:"+a+",b:"+b);
    }
}

class Swap2{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:"+a+",b:"+b);

        //位异或实现
        //左边a,b,a
        //右边a^b
        a = a^b;
        b = a^b;//a^b^b,b=a
        a = a^b;//a^b^a,a=b
        System.out.println("a:"+a+",b:"+b);
    }
}

class Swap3{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:"+a+",b:"+b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a:"+a+",b:"+b);
    }
}

class Swap4{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:"+a+",b:"+b);

        b = (a + b)-(a = b);
        System.out.println("a:"+a+",b:"+b);
    }
}

class OperatorDemo7{
    public static void main(String[] args) {
        System.out.println(3 << 2);
    }
}

class OperatorDemo8{
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int z = (x > y) ? x : y;
        System.out.println(z);
    }
}

class OperatorDemo9{
    public static void main(String[] args) {
        //get max in 2 nums
        int x = 100;
        int y = 200;
        int max1 = (x > y) ? x :y;
        System.out.println(max1);

        //get max in 3 nums
        int a = 10;
        int b = 20;
        int c = 30;

        //divided into 2 steps
        int temp = (a > b) ? a :b;
        int max2 = (temp > c) ? temp: c;
        System.out.println(max2);

        //one step
        int max3 = (a > b) ? ((a > c) ? a : c):((b > c) ? b : c);
        System.out.println(max3);

        //if two nums equal
        int m = 100;
        int n = 200;
        boolean flag = (m == n) ? true :false;
        System.out.println(flag);
    }
}


class GetInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入一个数字：");
        int x = sc.nextInt();

        System.out.println("你输入的数字是："+x);
    }
}

class GetInputTest{
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入两个数字，用空格分割开：");
        int x = sc1.nextInt();
        int y =sc1.nextInt();
        int z = x + y;
        System.out.println("你输入的数字之和是："+z);
        System.out.println("你输入的数字最大值是："+((x > y) ? x : y));
        
    }
}