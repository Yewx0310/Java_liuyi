package day7;
/*
基本类型：形式参数改变不影响实际参数

引用类型：形式参数改变直接影响实际参数
 */

//形式参数是基本类型
class Demo{
    public int sum(int a,int b){
        return a + b ;
    }
}

//形式参数是引用类型
class Student{
    public void show(){
        System.out.println("我爱学习");
    }
}

class StudentDemo{
    //如果看到一个方法的形式参数是一个类（引用类型），那么需要该方法参数对应的类的实例（对象）来调用这个方法
    public void method(Student s){//调用时，将main方法中的s的地址传递到了这里
        s.show();
    }
}

class ArgsTest {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.sum(2,3));

        //形式参数是引用类型的调用
        //需求：我要调用StudentDemo中的method方法

        StudentDemo sd = new StudentDemo();
        //创建学生对象
        Student s = new Student();
        sd.method(s);
    }
}
