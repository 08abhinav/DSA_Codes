public class ZeroFilledSub {
    public static long zeroFillSub(int[] nums){
        int count = 0, ans = 0;
        for(int i : nums){
            if(i == 0){
                count++;
                ans += count;
            }else{
                count = 0;
            }
        }
        return ans;
    }
    public static void main(String...args){

    }
}
