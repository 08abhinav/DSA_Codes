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
        
    }
}