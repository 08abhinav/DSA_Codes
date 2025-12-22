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

    }
}
