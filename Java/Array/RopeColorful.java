/*1578. Minimum Time to Make Rope Colorful
Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.

Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, so she asks Bob for help. 
Bob can remove some balloons from the rope to make it colorful. You are given a 0-indexed integer array neededTime where neededTime[i] 
is the time (in seconds) that Bob needs to remove the ith balloon from the rope.

Return the minimum time Bob needs to make the rope colorful */
public class RopeColorful{
    public static int ropeColorful(String colors, int[] neededTime){
        int minTime = 0;
        int maxTime = neededTime[0];
        for(int i = 1; i < colors.length(); i++){
            if(colors.charAt(i) == colors.charAt(i - 1)){
                minTime += Math.min(neededTime[i], maxTime);
                maxTime = Math.max(neededTime[i], maxTime);
            }else{
                maxTime = Math.max(neededTime[i], maxTime);
            }
        }
        return minTime;
    }
    public static void main(String[] args) {
        int[] neededTime = {1, 2, 3, 4, 1};
        String s = "aabaa";
        System.out.println(ropeColorful(s, neededTime));
    }
}