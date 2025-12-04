/*2211. Count Collisions on a Road
There are n cars on an infinitely long road. The cars are numbered from 0 to n - 1 from left to 
right and each car is present at a unique point.

You are given a 0-indexed string directions of length n. directions[i] can be either 'L', 'R', or 
'S' denoting whether the ith car is moving towards the left, towards the right, or staying at its 
current point respectively. Each moving car has the same speed.

The number of collisions can be calculated as follows:

When two cars moving in opposite directions collide with each other, the number of collisions increases by 2.
When a moving car collides with a stationary car, the number of collisions increases by 1.
After a collision, the cars involved can no longer move and will stay at the point where they collided. 
Other than that, cars cannot change their state or direction of motion.

Return the total number of collisions that will happen on the road. */
public class CountCollisions{
    public static int collisions(String directions){
        int n = directions.length();
        int r = n - 1, l = 0, ans = 0;
        while(l < n &&  directions.charAt(l) == 'L') l += 1;
        while(r >= l &&  directions.charAt(r) == 'R') r -= 1;

        for(int i = l; i <= r; i++){
            if(directions.charAt(i) != 'S') ans += 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        String directions = "RLRSLL";
        System.out.println(collisions(directions));
    }
}