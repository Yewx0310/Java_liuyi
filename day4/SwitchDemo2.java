package day4;

/*
使用switch注意事项
case后面的值只能是常量
case标签不能重复
default可以省略但是不建议
*/
public class SwitchDemo2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        switch (a){
            default:
                b++;
            case 3 :
                b++;
            case 4 :
                b++;
        }
        System.out.println(b);
    }
}
