/**You are given a string s consisting of the characters 'N', 'S', 'E', and 'W', where s[i] indicates movements in an infinite grid:

'N' : Move north by 1 unit.
'S' : Move south by 1 unit.
'E' : Move east by 1 unit.
'W' : Move west by 1 unit.
Initially, you are at the origin (0, 0). You can change at most k characters to any of the four directions.

Find the maximum Manhattan distance from the origin that can be achieved at any time while performing the movements in order.

The Manhattan Distance between two cells (xi, yi) and (xj, yj) is |xi - xj| + |yi - yj|. */
public class MaxMD{
    public static int maxManhattanDis(String s, int k){
        int ans = 0;
        int north = 0, south = 0, east = 0, west = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'N') north++;
            else if(c == 'S') south++;
            else if(c == 'E') east++;
            else if(c == 'W') west++;

            int x = Math.abs(north - south);
            int y = Math.abs(east - west);
            int MD = x + y;
            int dis = MD + Math.min(2*k, i+1-MD);
            ans = Math.max(ans, dis);
        }
        return ans;
    }
    public static void main(String[] args){
        String s = "NSWE";
        int k = 1;
        System.out.println(MaxMD.maxManhattanDis(s, k));
    }
}