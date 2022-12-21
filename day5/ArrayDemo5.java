package day5;
/*
数组遍历
 */
public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        arrayPrint(a);
        getMax(a);
        getMin(a);
        reverse(a);
        arrayPrint(a);
        reverse(a);
        int sym = getItem(a,4);
        System.out.println(sym);
    }
    public static void arrayPrint(int[] a){
        System.out.print("[");
        for(int x = 0;x < a.length;x++){
            if(x == a.length-1){
                System.out.println(a[x]+"]");
            }
            else {
                System.out.print(a[x]+",");
            }
        }
    }

    public static void getMax(int[] a){
        int max = a[0];
        for(int x = 1;x < a.length;x++){
            if(a[x] > max){
                max = a[x];
            }else {
                max = max;
            }
        }
        System.out.println("Max:"+max);
    }
    public static void getMin(int[] a){
        int min = a[0];
        for(int x = 1;x < a.length;x++){
            if(a[x] < min){
                min = a[x];
            }else {
                min = min;
            }
        }
        System.out.println("Min:"+min);
    }

    public static void reverse(int[] a) {
        int start ;
        int end;
        for(start=0,end=a.length-1;start <= end;start++,end--) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        }
    }

    public static int getItem(int[] a,int value){
        int sym = -1;
        for(int i=0;i<a.length;i++){
            if(a[i] == value) {
                sym = i;
                System.out.println(sym);
                break;
            }
        }
        return sym;
    }
}
