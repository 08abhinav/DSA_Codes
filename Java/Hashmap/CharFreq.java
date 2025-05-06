import java.util.HashMap;

class CharFreq{
    public void freqCount(String str){
        HashMap<Character, Integer> freq = new HashMap<>();
        char[] letters = str.replaceAll(" ", "").toCharArray();
        for(char c: letters){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        System.out.println("Frequency of each character is a string is");
        System.out.println(freq);
    }
}