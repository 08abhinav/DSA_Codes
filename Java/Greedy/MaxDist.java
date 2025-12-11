import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxDist{
    public static int maxDistance(List<List<Integer>> arrays){
        int globalMin = arrays.get(0).get(0);
        int globalMax = arrays.get(0).get(arrays.get(0).size() - 1);
        int result = 0;

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> curr = arrays.get(i);
            int localMin = curr.get(0);
            int localMax = curr.get(curr.size() - 1);

            result = Math.max(result, Math.max(localMax - globalMin, globalMax - localMin));

            globalMin = Math.min(globalMin, localMin);
            globalMax = Math.max(globalMax, localMax);
        }

        return result;
    }
    public static void main(String...args){
        List<List<Integer>> li = new ArrayList<>();
        li.add(Arrays.asList(1, 2, 3));
        li.add(Arrays.asList(4, 5));
        li.add(Arrays.asList(1, 2, 3));
        System.out.println(maxDistance(li));
    }
}