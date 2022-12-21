package day4;

public class BreakDemo_whiledemo {
    public static void main(String[] args) {
//        int count = 1;
//        double money = 0;
//        while(true){
//            count++;
//            money += 2.5;
//            if(count % 5 == 0){
//                money -= 6;
//                System.out.println(money);
//            }
//            if(money > 100){
//                System.out.println(count);
//                break;
//            }
//        }

        //每天要存储的钱
        double dayMoney = 2.5;
        //天数
        int dayCount = 1;
        //总的存钱数
        double daySum = 0;

        int result = 100;

        while (true){
            daySum += dayMoney;

            //判断一下
            if(daySum > 100){
                System.out.println("共花了"+dayCount+"存储了"+daySum+"元");
                break;
            }
            if(dayCount % 5 == 0){
                //花去六元钱
                daySum -= 6;
                System.out.println("第"+dayCount+"天花去6元");
            }
            dayCount++;
        }
    }
}
