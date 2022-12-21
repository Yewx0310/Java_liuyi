package day4;

public class ForDemo8 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=100;i<=1000;i++){
            int a = i / 100;
            int b = (i-a*100) / 10;
            int c = (i-a*100-b*10);
            if((a*a*a + b*b*b + c*c*c) == i){
                count += 1;
            }
        }
        System.out.println("水仙花数共有:"+count);
    }
}
