package day7;


class Student_1{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age < 0 || age> 120){
            System.out.println("输入年龄不合法");
        }else{
            this.age = age;
        }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

class Student_1_Demo{
    public static void main(String[] args) {
        Student_1 s = new Student_1();
        s.setAge(27);
        s.setName("Lily");

        int age = s.getAge();
        String name = s.getName();
        System.out.println("Name:"+name+"-----"+"Age:"+age);
    }
}
