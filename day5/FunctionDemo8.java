package day5;

class FunctionDemo8 {
    public static void main(String[] args) {
        byte a = 'c';
        byte b = 'c';
        int c = 10;
        int d = 20;
        short e = 1;
        short f = 2;
        long g = 99999;
        long h = 8888;

        System.out.println(equal(a,b));
        System.out.println(equal(c,d));
        System.out.println(equal(e,f));
        System.out.println(equal(g,h));
    }
    public static boolean equal(byte a ,byte b){
        return a == b;
    }
    public static boolean equal(int a ,int b){
        return a == b;
    }
    public static boolean equal(short a ,short b){
        return a == b;
    }
    public static boolean equal(long a ,long b){
        return a == b;
    }
}
