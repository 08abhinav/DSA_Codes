import java.util.Arrays;

public class Permuation{
    public static void nextPermuation(int[] nums){
        int ind1 = -1, ind2 = -1;

        for(int i = nums.length - 2; i >=0; i--){
            if(nums[i] < nums[i + 1]){
                ind1 = i;
                break;
            }
        }

        if(ind1 == -1){
            reverse(nums, 0);
        }else{
            for(int i = nums.length - 1; i >= 0; i--){
                if(nums[i] > nums[ind1]){
                    ind2 = i;
                    break;
                }
            }
            swap(nums, ind1, ind2);
            reverse(nums, ind1 + 1);
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int s){
        int l = s;
        int r = nums.length - 1;
        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Permuation.nextPermuation(nums);
        System.err.println(Arrays.toString(nums));
    }
}