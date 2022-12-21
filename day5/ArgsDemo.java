package day5;

public class ArgsDemo {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("a:"+a+",b:"+b);
        change(a,b);
        System.out.println("a:"+a+",b:"+b);
    }
    public static void change(int a ,int b){
        a = b;
        b = a + b;
        System.out.println("a:"+a+",b:"+b);
    }
}
