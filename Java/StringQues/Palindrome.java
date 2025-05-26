class Palindrome{
    static boolean checkPalind(String s){
        int b = 0, e = s.length()-1;
        
        while(b<e){
            if(s.charAt(b) != s.charAt(e)){
                return false;
            }
            b++;
            e--;
        }
        return true;
    }
    public static void main(String...ars){
        String s = "racecar";
        System.out.println(Palindrome.checkPalind(s));
    }
}