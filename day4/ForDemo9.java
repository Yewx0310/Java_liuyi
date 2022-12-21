package day4;
/*
统计1000以内，对3整除余2，对5整除余3，对7整除余2的数字
 */
public class ForDemo9 {
    public static void main(String[] args) {
        for(int i = 1;i<=1000;i++){
            if((i % 3 ==2) && (i % 5 ==3) && (i % 7 ==2)){
                System.out.println(i);
            }
        }
    }
}
