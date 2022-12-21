package day7;

class Phone1{
    private String brand;
    private String color;
    private int price;

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    public void setPrice(int price){
        if(price < 0){
            System.out.println("输入价格不合法");
        }else{
            this.price = price;
        }
    }
    public int getPrice(){
        return this.price;
    }
}

class PhoneDemo{
    public static void main(String[] args) {
        Phone1 phone = new Phone1();
        phone.setBrand("Apple");
        phone.setColor("Black");
        phone.setPrice(5999);

        System.out.println("Brand:"+phone.getBrand()+"--"+"Color:"+phone.getColor()+"--"+"Price:"+phone.getPrice());
    }
}
