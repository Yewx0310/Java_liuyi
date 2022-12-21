package day4;

//求1-100之和
/*
初始化语句
while（判断语句）{
    循环体语句；
    控制条件语句；
}

 */
public class WhileDemo2 {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        while (x <= 100){
            sum += x;
            x++;
        }
        System.out.println("sum:"+sum);
    }
}
