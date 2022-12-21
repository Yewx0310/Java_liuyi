package day7;
/*
成员变量和局部变量的区别
1、位置不同

 */

class Variable{
    //成员变量
    int num; //默认值0

    public void show(){
        int num2 = 10; //局部变量，没有默认值
        System.out.println(num2); // 必须先初始化

//        int num = 20;
        System.out.println(num);
    }
}
class VariableDemo {
    public static void main(String[] args) {
        Variable v = new Variable();
        System.out.println(v.num);
        v.show();
    }
}
