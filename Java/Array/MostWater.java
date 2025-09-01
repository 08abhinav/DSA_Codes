public class MostWater{
    public static int maxWater(int[]arr){
        int left = 0, right = arr.length - 1;
        int res = 0;
        while(left < right){
            int water = Math.min(arr[left], arr[right]) * (right - left);
            res = Math.max(water, res);

            if(arr[left] < arr[right]){
                left += 1;
            }else{
                right -= 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 3};
        System.out.println(MostWater.maxWater(arr));
    }
}