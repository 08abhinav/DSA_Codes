public class BrokenCal {
    public static int brokenCalcu(int startValue, int target){
        int res = 0;
        while(target > startValue){
            if(target % 2 == 0){
                target /= 2;
            }else{
                target += 1;
            }
            res += 1;
        }
        return res + (startValue - target);
    }
    public static void main(String[] args){
        
    }
}
