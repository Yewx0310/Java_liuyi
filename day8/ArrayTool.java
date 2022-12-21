/**
 * 这是对数组进行操作的工具类
 * @author Ywx
 * @version V1.0
 */

package day8;

public class ArrayTool{
    /**
     * 这是私有构造
     */
    private ArrayTool(){}
    public static void printArray(int[] arr){
        for(int x =0;x < arr.length;x++){
            System.out.println(arr[x]);
        }
    }

    /**
     * 这是获取数组最大值的方法
     * @param arr 输入为一个数组
     * @return int 返回数组最大值
     */
    public static int getMax(int[] arr){
        int max = arr[0];
        for(int x = 1;x < arr.length;x++){
            if(arr[x] > max){
                max = arr[x];
            }
        }
        return max;
    }

    public static int getIndex(int[] arr,int value){
        int index = -1;
        for(int x = 0;x < arr.length;x++){
            if(arr[x] == value){
                index = x;
            }
        }
        return index;
    }
}

