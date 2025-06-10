class MaxDiff{
    public static int maxDifference(String s){
        int[] freq = new int[26];
        int a1 = 0, a2 = s.length();

        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }

        for(int i=0; i<26; i++){
            if(freq[i] % 2 != 0){
                a1 = Math.max(a1, freq[i]);
            }
            if(freq[i] % 2 == 0 && freq[i] > 0){
                a2 = Math.min(a2, freq[i]);
            }
        }
        return a1 - a2;
    }
    public static void main(String[] args) {
        String s = "aaabb";
        System.out.println(MaxDiff.maxDifference(s));
    }
}