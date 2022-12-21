package day4;
/*
求5的阶乘
*/
public class ForDemo5 {
    public static void main(String[] args) {
        int jc = 1;
        //这里的x可以直接从2开始
        for(int i =1;i<=5;i++){
            jc *= i;
        }
        System.out.println("5的阶乘是："+jc);
    }
}
