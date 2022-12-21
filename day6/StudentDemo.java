package day6;
/*
在一个java文件中写两个类，一个基本的类，一个测试类
注意：文件名与测试类一致

如何使用类呢？
    创建对象使用
    格式：类名 对象名 = new 类名（）；
如何使用成员变量和方法呢？
    对象名.变量
    对象名.方法（）
 */
class Student{
    String name;//默认值null
    int age;//0
    String address;//null

    //定义方法
    public void study(){
        System.out.println("学生爱学习");
    }

    public void eat(){
        System.out.println("学习饿了要吃饭");
    }

    public void sleep(){
        System.out.println("学习累了要睡觉");
    }
}
class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        //访问成员变量
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.address);

        //给成员变量赋值
        s.name = "wu";
        s.age = 18;
        s.address = "UESTC";
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.address);

        //调用方法
        s.eat();
        s.study();
        s.sleep();
    }

}
