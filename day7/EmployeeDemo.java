package day7;

class Employee{
    private String employeeId;
    private String name;
    private int age;

    //构造方法
    public Employee(){

    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }
    public String getEmployeeId(){
        return employeeId;
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
        System.out.println("员工编号:"+employeeId+"姓名:"+name+"年龄:"+age);
    }
}
class EmployeeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployeeId("A0001");
        e.setName("Li");
        e.setAge(22);

        e.show();
    }
}
