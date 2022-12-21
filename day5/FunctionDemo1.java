package day5;
/*
要写一个方法要先明确返回值类型和参数列表，即要接受的参数及参数类型

特点：不调用不执行
如何调用呢
 */
class FunctionDemo1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        //方法调用
        int c = sum(x,y);
        System.out.println(c);
    }

    /*
    需求：求两个数之和
    返回值：int
    参数列表：两个，都是int类型
     */
    public static int sum(int a, int b ){
        //int c = a + b;
        //return c;
        return a + b ;
    }
}
/*
class FunctionDemo{
    public static void main(String[] args){
        int x = 10;
        int y = 20;

        int result = sum(x,y);
        System.out.println(result);
    }

    public static int sum(int a,int b){
        return a + b;
    }
}
 */