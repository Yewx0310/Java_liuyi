package day7;

class Demo1{
    private int num=10;
    public void show(){
        System.out.println(num);
    }

    private void method(){//被private修饰后只能使用public方法来调用这个private方法
        System.out.println("method");
    }

    public void function(){
        method();
    }

}

class PrivateDemo {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.show();
        //d.method();错误
        d.function();
    }
}
