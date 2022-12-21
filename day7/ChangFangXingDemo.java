package day7;

import java.util.Scanner;

class ChangFangXing{
    private int length;
    private int width;

    public ChangFangXing(){

    }

    //只提供set方法
    public void setLength(int length){
        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getZhouChang(){
        return (length + width) * 2;
    }

    public int getArea(){
        return length * width;
    }
}
public class ChangFangXingDemo {
    public static void main(String[] args){
        //创建键盘对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长：");
        int length = sc.nextInt();
        System.out.println("请输入宽：");
        int width = sc.nextInt();

        ChangFangXing a = new ChangFangXing();
        a.setLength(length);
        a.setWidth(width);

        int circle = a.getZhouChang();
        int area = a.getArea();
        System.out.println("周长："+circle+"----"+"面积："+area);
    }
}
