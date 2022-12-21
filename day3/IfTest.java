package day3;
//获取三个数中的最大值

public class IfTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        //三元实现
        int temp = (a > b) ? a : b;
        int max = (temp > c) ? temp : c;
        System.out.println("max:"+max);

        //if实现
        if(a > b){
            temp = a;
            if (temp > c){
                max = temp;
            }else{
                max = c;
            }
        }else{
            temp = b;
            if (temp > c){
                max = temp;
            }else{
                max = c;
            }
        }
        System.out.println("max:"+max);
    }
}
