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
    public static void main(String[] args) {
        
    }
}