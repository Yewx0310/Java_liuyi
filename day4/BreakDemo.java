package day4;
/*
控制跳转语句：
    break:中断
    countinue:继续
    return:返回

break使用场景：
    switch与和循环语句
跳出单层循环和多层循环

标签名语句： 标签：语句

 */
public class BreakDemo {
    public static void main(String[] args) {

        //跳出单层循环
        for(int x = 0 ; x < 10;x++){
            if(x == 3){
                break;
            }
            System.out.println("Hello World!");
        }
        System.out.println("over!");
        System.out.println("-------------");
        wc:for(int x = 0;x < 4;x++){
            nc:for(int y = 0;y < 3;y++){
                if(y == 2){
                    //break nc;
                    break wc;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
