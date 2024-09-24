package Kunal_kushwaha.Linear_search;

public class Find_in_Matrix {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 5;
        int[] result = linearSearch(array, target);

        if (result != null) {
            System.out.println("Element found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int[] linearSearch(int[][] array, int target) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[]{row, col}; // Return the row and column index
                }
            }
        }
        return null; // Return null if the element is not found
    }
}
