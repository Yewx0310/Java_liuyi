package day5;

public class Array2Test2 {
    public static void main(String[] args) {
        int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        int sum = array2Sum(arr);
        System.out.println(sum);

    }
    public static int array2Sum(int[][] arr){
        int sum = 0;
        for(int x=0;x<arr.length;x++){
            for(int y=0;y<arr[x].length;y++){
                sum += arr[x][y];
            }
        }
        return sum;
    }
}
