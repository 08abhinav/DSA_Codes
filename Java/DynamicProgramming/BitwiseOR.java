import java.util.HashSet;
import java.util.Set;

public class BitwiseOR{
    public static int subarrayBitwise(int[] arr){
        Set<Integer> res = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            res.add(arr[i]);
            for(int j = i-1; j >= 0; j--){
                if(arr[j] == (arr[j] | arr[i]))break;
                arr[j] |= arr[i];
                res.add(arr[j]);
            }
        }
        return res.size();
    }
    public static void main(String[] args) {
        
    }
}