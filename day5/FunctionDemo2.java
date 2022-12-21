package day5;
import java.util.Scanner;

class FunctionDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据:");
        int b = sc.nextInt();
        System.out.println("请输入第三个数据:");
        int c = sc.nextInt();

        int d = getMax(a,b);
        boolean e = equal(a,b);
        int f = getMaxiInThree(a,b,c);
        int g = getMaxThree(a,b,c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
    public static int getMax(int a, int b){
        int c = a > b ? a : b;
        return c;
    }
    public static boolean equal(int a,int b){
        boolean c = (a == b) ;
        return c;
    }
    public static int getMaxiInThree(int a ,int b ,int c){
        int d = getMax(a,b);
        int e = getMax(c,d);
        return e;
    }

    public static int getMaxThree(int a,int b,int c){
//        int d;
//        if (a > b){
//            d = a;
//        }
//        else{
//            d = b;
//        }
//        if (d > c){
//            d = d;
//        }
//        else{
//            d = c;
//        }
//        return d;
//        if(a > b){
//            return a > c ? a :c;
//        }
//        else {
//            return b > c ? b : c;
//        }

        //再改进，但不建议这样写
        return a > b ? (a > c ? a :c) : (b > c ? b : c);

        /*
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        return max;
         */
    }

}
