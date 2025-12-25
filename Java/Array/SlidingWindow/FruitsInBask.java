/*
You are visiting a farm that has a single row of fruit trees arranged from left to right. 
The trees are represented by an integer array fruits where fruits[i] is the type of fruit 
the ith tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules 
that you must follow:

You only have two baskets, and each basket can only hold a single type of fruit. 
There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree 
(including the start tree) while moving to the right. The picked fruits must fit in one 
of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick. 
*/
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
