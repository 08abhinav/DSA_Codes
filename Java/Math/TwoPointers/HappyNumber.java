package Java.Math.TwoPointers;
class HappyNumber{
    public static boolean isHappyNumber(int n){
        int slow = n;
        int fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        }while(slow != fast);

        return slow == 1;
    }

    public static int square(int n ){
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}