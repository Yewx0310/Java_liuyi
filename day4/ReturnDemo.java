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
