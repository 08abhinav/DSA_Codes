import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArray{
    public static int[][] minDiff(int[] nums, int k){
        Arrays.sort(nums);
        List<int[]> res = new ArrayList<>();
        for(int i=0; i<nums.length; i+=3){
            if(nums[i+2] - nums[i] > k){
                return new int[0][];
            }
            res.add(new int[] {nums[i], nums[i+1], nums[i+2]});
        }
        return res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,8,7,9,3,5,1};
        int k = 2;
        System.out.println(Arrays.deepToString(DivideArray.minDiff(nums, k)));
    }
}   