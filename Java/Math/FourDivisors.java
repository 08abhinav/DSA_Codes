public class FourDivisors{
    public static int sumFourDivisors(int[] nums){
        int sum = 0;
        for(int i : nums){
            int s = sumIfFour(i);
            sum += s;
        }
        return sum;
    }
    public static void main(String...args){

    }
}