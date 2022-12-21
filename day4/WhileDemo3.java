package day4;
//统计水仙花数
public class WhileDemo3 {
    public static void main(String[] args) {
        int x = 100;
        int count = 0;
        while(x < 1000){
            int ge = x % 10;
            int shi = x / 10 % 10;
            int bai = x / 10 / 10 % 10;
            if((ge*ge*ge + shi*shi*shi +bai*bai*bai) == x){
                count++;
            }
            x++;
        }
        System.out.println(count);
    }
}
