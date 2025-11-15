import java.util.Arrays;
import java.util.Stack;

public class NextGreaterEle{
    public static int[] nextGreater(int[] nums){
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        Stack<Integer> stk = new Stack<>();

        for(int i = 0; i < nums.length; i++){
            while(!stk.isEmpty() && nums[i] > nums[stk.peek()]){
                int idx = stk.pop();
                res[idx] = nums[i];
            }
            stk.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 3, 6, 4, 8};
        System.out.println(Arrays.toString(nextGreater(nums)));
    }
}