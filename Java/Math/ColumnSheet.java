public class ColumnSheet {
    public static int titleNumber(String columnTitle){
        int res = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            res = res * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
