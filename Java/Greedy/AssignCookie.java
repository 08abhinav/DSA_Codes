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
        
    }
}
