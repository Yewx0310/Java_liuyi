package day8;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr ={28,55,37,46,19};

        //ArrayTool at = new ArrayTool();һ������˽�л�֮�󣬾Ͳ����ٴ�������ֻ�ܵ��þ�̬����
        //at.printArray(arr);
        ArrayTool.printArray(arr);
        int max = ArrayTool.getMax(arr);
        System.out.println("max:"+max);

        int index = ArrayTool.getIndex(arr,55);
        System.out.println("index:"+index);
    }

    //��̬����
//    public static void printArray(int[] arr){
//        for(int x =0;x < arr.length;x++){
//            System.out.println(arr[x]);
//        }
//    }
//    //�Ǿ�̬�޷�ʹ��
//    public  void printArray(int[] arr){
//        for(int x =0;x < arr.length;x++){
//            System.out.println(arr[x]);
//        }
//    }
//
}
