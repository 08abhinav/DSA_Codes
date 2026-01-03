/*
1411. Number of Ways to Paint N × 3 Grid
You have a grid of size n x 3 and you want to paint each cell of the grid with exactly one of 
the three colors: Red, Yellow, or Green while making sure that no two adjacent cells have the 
same color (i.e., no two cells that share vertical or horizontal sides have the same color).

Given n the number of rows of the grid, return the number of ways you can paint this grid. 
As the answer may grow large, the answer must be computed modulo 109 + 7. */
public class WaysToPaint {
    static final int MOD = 1000000007;
    public static int numOfWays(int n){
        long a[] = new long[n];
        long b[] = new long[n];
        a[0] = b[0] = 6;
        for(int i = 1; i < n; i++){
            a[i] = (2 * a[i - 1] + 2 * b[i - 1]) % MOD;
            b[i] = (2 * a[i - 1] + 3 * b[i - 1]) % MOD;
        }
        return (int)((a[n - 1] + b[n - 1]) % MOD);
    }
    public static void main(String... args){
        int n = 5000;
        System.out.println(numOfWays(n));
    }
}
