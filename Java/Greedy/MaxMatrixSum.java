/*
1975. Maximum Matrix Sum
You are given an n x n integer matrix. You can do the following operation any number of times:

Choose any two adjacent elements of matrix and multiply each of them by -1.
Two elements are considered adjacent if and only if they share a border.

Your goal is to maximize the summation of the matrix's elements. Return the maximum sum of the matrix's 
elements using the operation mentioned above. */
public class MaxMatrixSum {
    public static long maxSum(int[][] matrix){
        int n = matrix.length;
        int negCount = 0, minAbs = Integer.MAX_VALUE;
        long totalSum = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int value = matrix[i][j];
                totalSum += value;
                if(value < 0){
                    negCount++;
                }
                minAbs = Math.min(minAbs, Math.abs(value));
            }
        }

        return negCount % 2 == 0 ? totalSum : totalSum - 2 * minAbs;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, -1}, {-1, 1}};
        System.out.println(maxSum(matrix));
    }
}
