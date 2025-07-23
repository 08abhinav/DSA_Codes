public class Coprimes {
    public static int countCoPrimes(int[] arr){
        int n = arr.length, count = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(gcd(arr[i], arr[j]) == 1) count++;
            }
        }
        return count;
    }
    public static void main(String... args){

    }
}
