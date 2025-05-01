/*  Replace the digit to character in a string 
 * like "a1b2c3"-> "abbdcf"
*/
class RepDToCh{
    public String replaceDigit(String s){
        char arr[] = s.toCharArray();
        for(int i=1;i<s.length();i++){
            if(i%2!=0){
                int shift = arr[i] - '0';
                arr[i] = (char)((arr[i-1] + shift - 'a')%26 + 'a');
            }
        }
        return new String(arr);
    }
}