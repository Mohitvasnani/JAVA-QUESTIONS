package Kunal_kushwaha.Linear_search;

public class Min_Max_Matrix {
    public static void main(String[] args) {
        int[][] array = {
                {11, 22, 3},
                {4, 15, 6},
                {72, 18, 29}
        };
        System.out.println(Min(array));
        System.out.println(Max( array));
    }
    static int Min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j] <min) {
                    min = arr[i][j];
                }

            }
        }
        return min;
    }
    static int Max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j] >max) {
                    max = arr[i][j];
                }

            }
        }
        return max;
    }
}
