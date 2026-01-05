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
        
    }
}
