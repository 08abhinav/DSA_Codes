import java.util.ArrayList;
import java.util.List;

public class PascalTriangle{
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0) return res;

        if(numRows == 1){
            List<Integer> li = new ArrayList<>();
            li.add(1);
            res.add(li);
            return res;
        }

        res = generate(numRows - 1);
        List<Integer> prevRow = res.get(numRows - 2);
        List<Integer> currRow = new ArrayList<>();

        for(int i=1; i<numRows -1 ; i++){
            currRow.add(prevRow.get(i - 1) + prevRow.get(i));
        }
        currRow.add(1);
        res.add(currRow);
        return res;
    }
    public static void main(String[] args) {
        
    }
}