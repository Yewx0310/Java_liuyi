package day4;
/*
输出九九乘法表

\r :回车
\t: table
\n: 换行
 */
public class ForFoeDemo3 {
    public static void main(String[] args) {
        for(int x = 0;x < 9;x++){
            for(int y =0;y <= x;y++){
                System.out.print('*');
            }
            System.out.println();
        }

        //为了方便，数据改成从1开始

        for(int i = 1;i <= 9;i++){
            for(int j =1;j <= i;j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}
