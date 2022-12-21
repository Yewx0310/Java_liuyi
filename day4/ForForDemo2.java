package day4;

public class ForForDemo2 {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
            for(int j = 0 ;j<i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("----------------");
        //方法2
        for(int x = 0;x < 5;x++){
            for(int y = 0;y <= x;y++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
