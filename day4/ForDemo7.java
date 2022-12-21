package day4;

public class ForDemo7 {
    public static void main(String[] args) {
        for(int i =10000;i<100000;i++){
             int ge = i % 10;
             int shi =  i / 10 % 10;
             int bai = i / 10 /10 % 10;
             int qian = i / 10 /10 /10 % 10;
             int wan =  i / 10 /10 /10 / 10 % 10;
             if(ge == wan && shi == qian && (ge + shi + qian + wan) == bai){
                 System.out.println(i);
             }
        }
    }
}
