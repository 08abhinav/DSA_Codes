public class OriginalString{
    public static int possibleStringCount(String word){
        int n = word.length(), count = 1;
        for(int i=0; i<n-1; i++){
            if(word[i] == word[i+1]) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}