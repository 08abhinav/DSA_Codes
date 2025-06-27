import java.util.LinkedList;
import java.util.Queue;

public class LongestSubSeq{
    public String longestSubsequenceRepeatedK(String s, int k) {
        String r="";
        Queue<String> q=new LinkedList<>();
        for(q.add("");!q.isEmpty();) {
            String c=q.poll();
            for(char ch='a';ch<='z';ch++) {
                String n=c+ch;
                if(isK(n,s,k)) {
                    r=n;
                    q.add(n);
                }
            }
        }
        return r;
    }
    public static void main(String... args){

    }
}