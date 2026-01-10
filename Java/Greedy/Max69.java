/*
1323. Maximum 69 Number
You are given a positive integer num consisting only of digits 6 and 9.
Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 
*/
public class Max69{
    public static int maximun69Num(int num){
        char[] ch = String.valueOf(num).toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '6'){
                ch[i] = '9';
            }
        }
        return Integer.parseInt(new String(ch));
    }
    public static void main(String...args){
        int num = 9669;
        System.out.println(Max69.maximun69Num(num));
    }
}