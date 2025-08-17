/*Assume you are an awesome parent and want to give your children some cookies. 
But, you should give each child at most one cookie.

Each child i has a greed factor g[i], which is the minimum size of a cookie that the 
child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], 
we can assign the cookie j to the child i, and the child i will be content. 
Your goal is to maximize the number of your content children and output the maximum number. 
*/
import java.util.Arrays;

public class AssignCookie {
    public static int findContentChildren(int[] g, int[] s){
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0, cookie = 0, happy = 0;

        while(child < g.length && cookie < s.length){
            if(s[cookie] >= g[child]){
                happy++;
                child++;
                cookie++;
            }else{
                cookie++;
            }
        }
        return happy;
    }
    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        System.out.println(AssignCookie.findContentChildren(g, s));
    }
}
