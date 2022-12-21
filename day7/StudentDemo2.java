package day7;
/*
一个标准类的写法
 */
class Student3{
    //成员变量
    private String name;
    private int age;

    //构造方法
    public Student3(){
        
    }
    public Student3(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println("Name:"+name+"----"+"Age:"+age);
    }
}

class StudentDemo2 {
    public static void main(String[] args) {
        Student3 s = new Student3();
        s.setName("林青霞");
        s.setAge(27);
        s.show();

        Student3 st = new Student3("刘益",22);
        st.show();
    }
}
