package day4;
/*
跳出本次循环
 */
public class ContinueDemo {
    public static void main(String[] args) {
        for(int x = 0;x < 10;x++){
            if(x == 2){
                //break;
                continue;
            }
            System.out.println(x);
        }
    }
}
