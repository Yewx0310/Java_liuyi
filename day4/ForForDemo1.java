package day4;
//打印一个四行五列的*图案
public class ForForDemo1 {
    public static void main(String[] args) {
        for(int i = 0;i <= 4;i++){
            System.out.println("*****");
        }

        //输出语句的另一种格式
        System.out.print('*');   //不换行
        System.out.print('*');   //不换行

        //我们可以通过空语句实现换行
        System.out.println();   //空语句换行

        //循环嵌套，外循环控制行，内循环控制列
        for(int i =0;i<4;i++){
            for(int j = 0;j <5;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
