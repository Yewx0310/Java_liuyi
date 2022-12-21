package day4;

public class WhileDemo5 {
    public static void main(String[] args) {
        double x = 0.01;
        int count = 0;
        while(x <8848){
            x = x * 2;
            count++;
        }
        System.out.println(x);
        System.out.println(count);

        //可以将0.01改写为1，那么8848改写为884800
        int count1 = 0;
        int start = 1;
        int end = 884800;
        while(start < end){
            start *= 2;
            count1++;
        }
        System.out.println("要叠"+count1+"次");
    }
}
