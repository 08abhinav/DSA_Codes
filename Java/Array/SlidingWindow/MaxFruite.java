public class MaxFruite {
    public static int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int left = 0, sum = 0, max = 0;

        for (int right = 0; right < fruits.length; right++) {
            sum += fruits[right][1];

            while (left <= right && minSteps(fruits[left][0], fruits[right][0], startPos) > k) {
                sum -= fruits[left][1];
                left++;
            }

            max = Math.max(max, sum);
        }

        return max;
    }
    public static void main(String[] args) {
        
    }
}
