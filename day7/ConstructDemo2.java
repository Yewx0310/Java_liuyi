package day7;

/*
我们一直在使用构造方法
但是一直没写

如果我们没有给出构造方法，系统会自动给出
我们提供了，系统就不会再提供了
 */
class student{
    private String name;
    private int age;

    public student(){
        System.out.println("这是无参构造方法");
    }

    public student(String name){
        this.name = name;
    }

    public student(int age){
        this.age = age;
    }

    public student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println(name+"------"+age);
    }
}

class ConstructDemo2 {
    public static void main(String[] args) {
        student st1 = new student("Lin",22);
        st1.show();
    }
}
