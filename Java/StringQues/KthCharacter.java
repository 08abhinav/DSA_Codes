public class KthCharacter{
    public static char kthchar(int k){
        StringBuilder sb = new StringBuilder("a");
        while(sb.length() < k){
            int size = sb.length();
            for(int i=0; i<size; i++){
                sb.append((char) ('a' - ((sb.charAt(i) - 'a') + 1) % 26));
            }
        }
        return (sb.charAt(k - 1));
    }
    public static void main(String[] args) {
        
    }
}