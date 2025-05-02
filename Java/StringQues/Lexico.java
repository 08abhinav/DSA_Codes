/*We have given n and k where n is the number of characters in a string and k is 
 sum of their numeric value.
 -> for example:
    -> n=3 and k=27 so it will be "aay"
    a=1, a=1, and y=25
 */

class Lexico{
    public String getSmallestString(int n, int k){
        char[] res = new char[n];
        int numValue=0;
        for(int i=0;i<n;i++){
            res[i] = 'a';
            k--;
        }
        while(k>0){
            numValue = Math.min(25, k);
            res[--n] += numValue;
            k -= numValue;
        }

        return String.valueOf(res);
    }
}