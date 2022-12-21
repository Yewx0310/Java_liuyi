package day4;
/*
for与while的区别
如果明确循环范围，用for循环合适
如果不明确范围，用while循环

 */
public class WhileDemo4 {
    public static void main(String[] args) {
        for(int x = 1; x <= 10;x++){
            System.out.println("学习JAVA！");
        }
        //x只在for循环内部存在，一旦跳出循环就不能在使用
        //例如：System.out.println(x);就会报错
        //但是while仍然可以使用

        int y = 1;
        while(y <= 10){
            System.out.println("Learn JAVA!");
            y++;
        }
        //这里是可以继续访问的
        System.out.println(y);
    }
}
