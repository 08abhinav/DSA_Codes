import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class MaxFreqEle{
    public static int maxFreq(int[] arr){
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        int max = 0;
        for(int i: arr){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        for(Entry<Integer, Integer> entry: freq.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                count = max;
            }else if(entry.getValue() == max){
                count += max;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}