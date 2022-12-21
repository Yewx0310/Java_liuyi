package day4;
/*
水仙花数：三位数字，每一位的立方之和等于这个数本身
 */
public class ForDemo6 {
    public static void main(String[] args) {
        for(int i=100;i<=1000;i++){
            int a = i / 100;
            int b = (i-a*100) / 10;
            int c = (i-a*100-b*10);
            if((a*a*a + b*b*b + c*c*c) == i){
                System.out.println(i);
            }
        }
    }
}
