/**
 * Give an array of non-negative integers and we have to find how many jumps are required from starting to end
 -> for eg arr = [0, 1, 3, 4] it will return -1 because starting index is 0 we can't go anywhere from here.
           arr = [1, 2, 4, 5] it will return 2 because 1 jump from first index to second and 2 jumps from second to reach at last
 */
class MaxJumps{
    public static int countJumps(int[] arr){
        int n = arr.length;
        if(n <= 1) return -1;
        if(arr[0] == 0) return -1;

        int jumps = 1;
        int maxReach = arr[0];
        int steps = arr[0];

        for(int i=1;i<n;i++){
            if(i == n-1) return jumps;

            maxReach = Math.max(maxReach, i+arr[i]);
            steps--;

            if(steps==0){
                jumps++;
                if(i>=maxReach) return -1;
                steps = maxReach-i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(MaxJumps.countJumps(arr));
    }
}