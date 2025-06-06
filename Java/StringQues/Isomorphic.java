/**Isomorphic String 
 * Two strings are said to be isomorphic if characters in String s1 can be changed to get s2.
 */
public class Isomorphic {
    public static boolean checkIsomorphic(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        int[] mapS1 = new int[128];
        int[] mapS2 = new int[128];

        for(int i=0; i<s1.length(); i++){
            char cs1 = s1.charAt(i);
            char cs2 = s2.charAt(i);

            if(mapS1[cs1] != mapS2[cs2]) return false;
            mapS1[cs1] = mapS2[cs2] = i+1;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Isomorphic.checkIsomorphic("aab", "xxy"));
    }
}
