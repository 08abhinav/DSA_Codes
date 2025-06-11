/**You are given two arrays, color and radius, representing a sequence of balls:

color[i] is the color of the i-th ball.

radius[i] is the radius of the i-th ball.

If two consecutive balls have the same color and radius, remove them both. Repeat this process until no more such pairs exist.


Return the number of balls remaining after all possible removals. */
import java.util.ArrayDeque;
import java.util.Deque;

class RemoveBalls{
    public static int findLen(int[] colors, int[] radius){
        Deque<int[]> stack = new ArrayDeque<>();
        
        for(int i=0; i<colors.length; i++){
            int[] curr = new int[]{colors[i], radius[i]};

            if(!stack.isEmpty()){
                int[] top = stack.peek();
                if(top[0] == curr[0] && top[1] == curr[1]){
                    stack.pop();
                    continue;
                }
            }
            stack.push(curr);
        }
        return stack.size();
    }
    public static void main(String[] args) {
        // int[] colors = {2, 3, 5};
        // int[] radius = {3, 3, 5};
        int[] colors = {2, 2, 5};
        int[] radius = {3, 3, 5};
        System.out.println(RemoveBalls.findLen(colors, radius));
    }
}