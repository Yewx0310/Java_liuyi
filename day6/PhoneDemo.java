package day6;

class Phone{
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

class PhoneDemo {
    public static void main(String[] args) {
        Phone apple = new Phone();
        apple.brand = "Apple";
        apple.price = 5499;
        apple.color = "Black";
        System.out.println(apple.brand+"----"+apple.color+"----"+apple.price);

        apple.call("Ywx");
        apple.message();
        apple.playGame();
    }
}