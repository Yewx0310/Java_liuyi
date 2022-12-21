package day4;

public class ForDemo4 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=100;i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("sum:"+sum);

        int sum1 = 0;
        for(int i=0;i<=100;i += 2){
            sum1 += i;
        }
        System.out.println("sum1:"+sum1);
    }
}
