/*944. Delete Columns to Make Sorted
You are given an array of n strings strs, all of the same length.

The strings can be arranged such that there is one on each line, making a grid.
For example, strs = ["abc", "bce", "cae"] can be arranged as follows:
abc
bce
cae
You want to delete the columns that are not sorted lexicographically. In the above example (0-indexed), 
columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted, while column 1 ('b', 'c', 'a') is not, 
so you would delete column 1.

Return the number of columns that you will delete. */
public class DeleteColumn {
    public static int minDeletion(String[] strs){
        int count = 0;
        int m = strs.length;
        int n = strs[0].length();

        for(int col = 0; col < n; col++){
            for(int row = 0; row < m - 1; row++){
                if(strs[row].charAt(col) > strs[row + 1].charAt(col)){
                    count += 1;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String...args){
        String strs[] = {"cba", "daf", "ghi"};
        System.out.println(minDeletion(strs));
    }
}
