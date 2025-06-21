/**Given an array arr[], where each element contains either a 'P' for policeman or a 'T' for thief. 
 * Find the maximum number of thieves that can be caught by the police. 
Keep in mind the following conditions :

Each policeman can catch only one thief.
A policeman cannot catch a thief who is more than k units away from him. */
public class PolThief{
    public static int catchThief(char[] arr, int k){
        int n = arr.length;
        int i = 0, j = 0, count = 0;
        while(i < n && j < n){
            while( i < n && arr[i] != 'P') i++;
            while( j < n && arr[j] != 'T') j++;

            if( i < n && j < n && Math.abs(i - j) <= k){
                count++;
                i++;
                j++;
            }

            else if(i < n && i < j){
                i++;
            }

            else if(j < n && j < i){
                j++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        char[] arr = {'P', 'T', 'P', 'T'};
        int k = 1;
        System.out.println(PolThief.catchThief(arr, k));
    }
}