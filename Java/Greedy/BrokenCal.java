/*991. Broken Calculator
There is a broken calculator that has the integer startValue on its display initially. 
In one operation, you can:
multiply the number on display by 2, or
subtract 1 from the number on display.
Given two integers startValue and target, return the minimum number of operations needed to display target on the calculator. */
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
        int startValue = 3, target = 10;
        System.out.println(BrokenCal.brokenCalcu(startValue, target));
    }
}
