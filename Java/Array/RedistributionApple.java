/*3074. Apple Redistribution into Boxes
You are given an array apple of size n and an array capacity of size m.
There are n packs where the ith pack contains apple[i] apples. There are m boxes as well, 
and the ith box has a capacity of capacity[i] apples.
Return the minimum number of boxes you need to select to redistribute these n packs of apples into boxes.
Note that, apples from the same pack can be distributed into different boxes. */

import java.util.Arrays;

public class RedistributionApple {
    public static int minBoxes(int[] apple, int[] capacity){
        Arrays.sort(capacity);
        int sum = 0;
        for(int i : apple){
            sum += i;
        }

        int res = 0, cap = 0;
        for(int i = capacity.length - 1; i >= 0; i--){
            cap += capacity[i];
            if(cap >= sum){
                res = capacity.length - i;
                break;
            }
        }
        return res;
    }
    public static void main(String...args){
        int[] apple = {5, 5, 5};
        int[] capacity = {2, 4, 2, 7};
        System.out.println(minBoxes(apple, capacity));
    }
}
