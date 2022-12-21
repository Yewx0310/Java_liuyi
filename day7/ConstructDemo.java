package day7;
/*
构造方法：
 */

import java.sql.SQLOutput;

class Construct{
    public Construct(){
        System.out.println("这是构造方法");
    }
}
class ConstructDemo {
    public static void main(String[] args) {
        Construct c = new Construct();
        System.out.println(c);//Construct@4554617c
    }

}
