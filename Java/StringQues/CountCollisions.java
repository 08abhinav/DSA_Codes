public class CountCollisions{
    public static int collisions(String directions){
        int n = directions.length();
        int r = n - 1, l = 0, ans = 0;
        while(l < n &&  directions.charAt(l) == 'L') l += 1;
        while(r >= l &&  directions.charAt(r) == 'R') r -= 1;

        for(int i = l; i <= r; i++){
            if(directions.charAt(i) != 'S') ans += 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        String directions = "RLRSLL";
        System.out.println(collisions(directions));
    }
}