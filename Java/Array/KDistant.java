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