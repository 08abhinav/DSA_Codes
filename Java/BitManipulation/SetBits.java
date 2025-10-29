public class SetBits {
    // Approach 1
    // public static int smallestNum(int n){
    //     for(int i = 0; i <= n; i++){
    //         int z = 1 << i;
    //         if(z > n) return z - 1;
    //     }
    //     return 0;
    // }

    // Approach 2
    public static int smallestNum(int n){
        while((n & (n + 1)) != 0){
            n |= n + 1;
        }
        return n;
    }
    public static void main(String...args){

    }
}
