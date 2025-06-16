public class MaxDiff2{
    public static int maxDiff(int[] arr){
        int maxValue = 0;
        // method 1
        // int minValue = arr[0];
        // for(int i=1; i<arr.length; i++){
        //     if(arr[i] > minValue){
        //         maxValue = Math.max(maxValue, arr[i] - minValue);
        //     }
        //     minValue = Math.min(minValue, arr[i]);
        // }
        // return maxValue;

        // method 2
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    maxValue = Math.max(maxValue, arr[j] - arr[i]);
                }else{
                    continue;
                }
            }
        }
        return maxValue == 0 ? -1 : maxValue;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};
        System.out.println(MaxDiff2.maxDiff(arr));
    }
}