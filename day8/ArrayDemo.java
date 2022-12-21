package day8;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr ={28,55,37,46,19};

        //ArrayTool at = new ArrayTool();一旦将类私有化之后，就不能再创建对象，只能调用静态方法
        //at.printArray(arr);
        ArrayTool.printArray(arr);
        int max = ArrayTool.getMax(arr);
        System.out.println("max:"+max);

        int index = ArrayTool.getIndex(arr,55);
        System.out.println("index:"+index);
    }

    //静态方法
//    public static void printArray(int[] arr){
//        for(int x =0;x < arr.length;x++){
//            System.out.println(arr[x]);
//        }
//    }
//    //非静态无法使用
//    public  void printArray(int[] arr){
//        for(int x =0;x < arr.length;x++){
//            System.out.println(arr[x]);
//        }
//    }
//
}
