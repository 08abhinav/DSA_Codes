/*  Replace the digit to character in a string 
 * like "a1b2c3"-> "abbdcf"
*/
class RepDToCh{
    public String replaceDigit(String s){
        char arr[] = s.toCharArray();
        for(int i=1;i<s.length();i+=2){
            arr[i] = (char)(arr[i-1] + arr[i] - '0');
        }
        return String.valueOf(arr);
    }
}