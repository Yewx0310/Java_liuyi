package day4;

public class DoWhileDemo {
    public static void main(String[] args) {
        int x = 0;
        do{
            System.out.println("Hello World!");
            x++;
        }while(x < 10);
        System.out.println(x);

        //求和1-100
        int y = 1;
        int sum = 0;
        do{
            sum += y;
            y++;
        }while(y <= 100);
        System.out.println(sum);
    }
}
