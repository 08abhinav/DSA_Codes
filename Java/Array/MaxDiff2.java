public class MaxDiff2{
    public static int maxDiff(int[] arr){
        int maxValue = 0;
        int minValue = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > minValue){
                maxValue = Math.max(maxValue, arr[i] - minValue);
            }
            minValue = Math.min(minValue, arr[i]);
        }
        return maxValue;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};
        System.out.println(MaxDiff2.maxDiff(arr));
    }
}