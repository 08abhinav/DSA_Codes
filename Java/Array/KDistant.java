/**You are given a 0-indexed integer array nums and two integers key and k. 
 * A k-distant index is an index i of nums for which there exists at least one index j 
 * such that |i - j| <= k and nums[j] == key.

Return a list of all k-distant indices sorted in increasing order.

 */
import java.util.ArrayList;
import java.util.List;

public class KDistant{
    public static List<Integer> findDistantIndices(int[] arr, int key, int k){
        List<Integer> li = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[j] == key && Math.abs(i - j) <= k){
                    li.add(i);
                    break;
                }
            }
        }
        return li;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,9,1,3,9,5};
        int key = 9, k = 1;
        System.out.println(KDistant.findDistantIndices(arr, key, k));
    }
}