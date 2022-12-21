package day7;
/*
匿名对象：没有名字的对象

应用场景：调用方法（只调用一次）
        多次调用不合适，匿名对象调用完就是垃圾，可以被回收
        可以作为实际参数传递
 */

class Student1{
    public void show(){
        System.out.println("我爱学习");
    }
}


class NoNameDemo {
    public static void main(String[] args) {
        //带名字的调用
        Student1 st = new Student1();
        st.show();
        System.out.println("----------");

        //匿名对象
        new Student1().show();
        System.out.println("----------");
        StudentDemo std = new StudentDemo();
        //作为参数传递
        std.method(new Student());
        System.out.println("----------");
        new StudentDemo().method(new Student());
    }
}
