/*
168. Excel Sheet Column Title
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet. 
*/
class ExcelSheet{
    public static String convertToTitle(int columnNumber){
        StringBuilder res = new StringBuilder();
        while(columnNumber > 0){
            columnNumber -= 1;
            int rem = columnNumber % 26;
            res.append((char)('A' + rem));
            columnNumber /= 26;
        }
        return res.reverse().toString();
    }
    public static void main(String... args){
        int num = 701;
        System.out.println(ExcelSheet.convertToTitle(num)); 
    }
}