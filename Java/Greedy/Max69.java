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

    }
}