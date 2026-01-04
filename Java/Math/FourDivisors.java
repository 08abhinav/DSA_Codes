public class FourDivisors{
    public static int sumFourDivisors(int[] nums){
        int sum = 0;
        for(int i : nums){
            int s = sumIfFour(i);
            sum += s;
        }
        return sum;
    }

    private static int sumIfFour(int n){
        int d1 = 0, d2 = 0;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                if(d1 == 0){
                    d1 = i;
                    d2 = n / i;
                }else{
                    return 0;
                }
            }
        }
        if(d1 == 0)return 0;
        if(d1 == d2) return 0;

        return 1 + n + d1 + d2;
    }
    public static void main(String...args){
        int[] nums = {21, 4, 7};
        System.out.println(sumFourDivisors(nums));
    }
}