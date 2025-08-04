import java.util.HashMap;
import java.util.Map;

public class FruitsInBask {
    public static int totalFruit(int[] fruits){
        int n = fruits.length;
        if(n == 0) return 0;
        
        Map<Integer, Integer> count = new HashMap<>();
        int left = 0, maxLen = 0;
        for(int right = 0; right < n; right++){
           count.put(fruits[right], count.getOrDefault(fruits[right], 0)+ 1);
            
           while(count.size() > 2){
                int leftFruit = fruits[left];
                count.put(leftFruit, count.get(leftFruit) - 1);
                if(count.get(leftFruit) == 0){
                    count.remove(leftFruit);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String...args){
        int[] fruits = {1, 2, 1, 2, 3, 2, 2};
        System.out.println(FruitsInBask.totalFruit(fruits));
    }
}
