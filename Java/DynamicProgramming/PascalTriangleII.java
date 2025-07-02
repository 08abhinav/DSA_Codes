import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public static List<Integer> getRow(int rowIndex){
        List<Integer> row = new ArrayList<>();
        long ans = 1;
        for(int i=0; i<=rowIndex; i++){
            row.add((int)ans);
            ans = ans * (rowIndex - i) / (i + 1);
        }
        return row;
    }
    public static void main(String...args){
        int rowIndex = 4;
        System.out.println(PascalTriangleII.getRow(rowIndex));
    }
}
