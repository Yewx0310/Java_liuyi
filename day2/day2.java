package day2;

public class day2 {
    public static void main(String[] args) {
        System.out.println('a');
        System.out.println(0x10);
        float b = 12.345F;
        System.out.println(b);
        boolean a = false;
        System.out.println(a);
    }
}

class DataTypeDemo1{
    public static void main(String[] args) {
        //定义变量
        int x = 100;
    }
}

class DataTypeDemo2{
    public static void main(String[] args) {
        byte a = 3;
        int b = 4;
        System.out.println(a+b); //可以直接输出
        int c = a + b;
        System.out.println(c);
    }
}

/*
    强制转换：从大数据转换到小数据
    格式：目标数据类型 变量 = （目标数据类型）（被转换的数据）
 */
class DataTypeDemo3{
    public static void main(String[] args) {
        int a = 3;
        byte b = 4;
        byte c = (byte) (a + b);
        System.out.println(c);
    }
}

class DataTypeDemo4{
    public static void main(String[] args) {
        double d = 12.345;
        float f = (float) d;
        System.out.println(f);
    }
}

class DataTypeDemo5{
    public static void main(String[] args) {
        byte b1 = 3,b2 = 4,b;
        //b = b1 + b2;//byte先转换为int再进行计算，b1+b2结果是int，赋值给byte型的b会出错损失精度
        b = 3 + 4;//常量是先计算，判断是否在范围之内，再范围之内不报错
    }
}

class DataTypeDemo6{
    public static void main(String[] args) {
        byte b = (byte) 300;//输出44，300-256，不足256的减127再从-128倒推
        System.out.println(b);
    }
}

class DataTypeDemo7{
    public static void main(String[] args) {
        System.out.println('a');//输出字符a
        System.out.println('a' + 1);//a：97
    }
}

class DataTypeDemo8{
    public static void main(String[] args) {
        System.out.println("hello"+'a'+1);
        System.out.println('a'+1+"hello");

        System.out.println("5+5="+5+5);//5+5=55
        System.out.println(5+5+"=5+5");//10=5+5
    }
}

