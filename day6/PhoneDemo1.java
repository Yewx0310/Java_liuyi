package day6;

class PhoneDemo1 {
    String brand;
    int price;
    String color;

    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    public void message(){
        System.out.println("发短信");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }
}
