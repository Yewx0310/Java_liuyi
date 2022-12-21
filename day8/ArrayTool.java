/**
 * ���Ƕ�������в����Ĺ�����
 * @author Ywx
 * @version V1.0
 */

package day8;

public class ArrayTool{
    /**
     * ����˽�й���
     */
    private ArrayTool(){}
    public static void printArray(int[] arr){
        for(int x =0;x < arr.length;x++){
            System.out.println(arr[x]);
        }
    }

    /**
     * ���ǻ�ȡ�������ֵ�ķ���
     * @param arr ����Ϊһ������
     * @return int �����������ֵ
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

