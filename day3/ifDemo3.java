package day3;

public class ifDemo3 {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int max1;

        if(a > b){
            max1 = a;
        }else{
            max1 = b;
        }
        System.out.println(max1);

        int max2 = (a>b)?a:b;
        System.out.println(max2);

        int x = 100;

    }
}
