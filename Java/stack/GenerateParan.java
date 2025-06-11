import java.util.ArrayList;
import java.util.List;

class GenerateParan{
    public static List<String> generateParan(int n){
        List<String> res = new ArrayList<>();
        dfs(0, 0, "", n, res);
        return res;
    }
    private static void dfs(int openP, int closeP, String s, int n, List<String> res){
        if(openP == closeP && openP + closeP == n*2){
            res.add(s);
            return;
        }

        if(openP < n){
            dfs(openP + 1, closeP, s + "(", n, res);
        }

        if(closeP < openP){
            dfs(openP, closeP + 1, s + ")", n, res);
        }
    }
    public static void main(String[] args){
        int n = 3;
        System.out.println(GenerateParan.generateParan(n));
    }
}