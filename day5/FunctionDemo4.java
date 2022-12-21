package day5;

class FunctionDemo4 {
    public static void main(String[] args) {
        //for循环输出图形
        for(int x = 0;x < 4;x++){
            for(int y = 0;y < 5;y++){
            System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("--------------");
        draw(4,5);
    }
    //输出m行n列的*图形
    public static void draw(int m , int n){
        for(int x = 0;x < m;x++){
            for(int y = 0;y < n;y++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
