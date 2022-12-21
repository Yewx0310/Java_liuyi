package day5;

class FunctionDemo7 {
    public static void main(String[] args) {
        //jvm会根据不同的参数去调用不同的功能
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
        System.out.println(sum(10.5f,20));
    }
    //求两个数的和
    public static int sum(int a ,int b ){
        return a + b ;
    }
    //求三个数的和
    public static int sum(int a ,int b ,int c){
        return a + b + c ;
    }
    //求四个数的和
    public static int sum(int a ,int b ,int c,int d){
        return a + b + c + d;
    }
    public static float sum(float a,float b ){
        System.out.println("float");
        return a + b;
    }
}
