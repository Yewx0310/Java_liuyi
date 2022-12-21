package day7;
/*
无法从静态上下文引用非静态变量 num

静态方法中没有this关键字，this是随着对象的创建而存在的，静态比对象先存在
静态方法只能访问静态成员变量和静态方法
 */

class Teacher{
    public int num = 10;
    public static int num2 = 20;

    public void show(){
        System.out.println(num);//隐含告诉访问this.num
        System.out.println(this.num);
    }

    public static void method(){
        //无法从静态上下文引用非静态变量 num
        //System.out.println(num);
        System.out.println(num2);
    }
}

public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.show();
        t.method();
    }
}
