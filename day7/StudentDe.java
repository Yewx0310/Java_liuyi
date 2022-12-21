package day7;
/*
在类中对数据进行校验
 */
class Student2{
    String name;
    private int age;
    //写一个方法对数据进行校验
    public void setAge(int a){
        if(a < 0 || a> 120){
            System.out.println("你给的年龄不合法");
        }else {
            age = a;
        }
    }


    public void show(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
    }

}

class StudentDe {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.show();
        System.out.println("------------");

        s.name = "Lin";
        s.show();
        System.out.println("------------");

        //可以给成员变量赋值非法的值，要先对数值进行判断，在哪里判断呢？
        //例如：s.age = -27;
        s.setAge(-27);
        System.out.println("------------");
        s.setAge(27);
        s.show();
    }
}
