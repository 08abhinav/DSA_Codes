import java.util.ArrayList;

public class PowerOfK {
    // Approach 1
    // public static int fact(int num){
    //     if(num == 0 || num == 1) return 1;

    //     return num * fact(num - 1);
    // }
    // public static int maxKPower(int n, int k){
    //     int factRes = fact(n);
    //     int power = 0;

    //     while(factRes % k == 0){
    //         power++;
    //         factRes /= k;
    //     }
    //     return power;
    // }

    // Approach 2
    public static ArrayList<int[]> primeFactors(int num){
        ArrayList<int[]> factors = new ArrayList<>();

        int count = 0;
        while(num % 2 == 0){
            num /= 2;
            count++;
        }
        if(count > 0) factors.add(new int[]{2, count});

        for(int i=3; i*i <= num; i+=2){
            count = 0;
            while(num % i == 0){
                num /= i;
                count++;
            }

            if(count > 0){
                factors.add(new int[]{i, count});
            }
        }

        if(num > 1){
            factors.add(new int[]{num, 1});
        }
        return factors;
    }

    public static int legendre(int n, int p){
        int count = 0;
        for(long power=p; power<=n; power*=p){
            count += n / power;
        }
        return count;
    }

    public static int maxKPower(int n, int k){
        ArrayList<int[]> factors = primeFactors(n);
        int res = Integer.MAX_VALUE;

        for(int[] factor : factors){
            int prime = factor[0];
            int expInk = factor[1];

            int countInFact = legendre(n, prime);

            res = Math.min(res, countInFact / expInk);
        }
        return res; 
    }

    public static void main(String...ar){
        int n = 7, k = 2;
        System.out.println(PowerOfK.maxKPower(n, k));
    }
}
