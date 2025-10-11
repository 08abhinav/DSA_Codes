/*171. Excel Sheet Column Number

Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number. */
public class ColumnSheet {
    public static int titleNumber(String columnTitle){
        int res = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            res = res * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "ZY";
        System.out.println(ColumnSheet.titleNumber(s));
    }
}
