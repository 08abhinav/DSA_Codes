public class SetBits {
    // Approach 1
    public static int smallestNum(int n){
        for(int i = 0; i <= n; i++){
            int z = 1 << i;
            if(z > n) return z - 1;
        }
        return 0;
    }
    public static void main(String...args){

    }
}
