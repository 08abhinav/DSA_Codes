/* Rabin-Karp Algorithm
 * This string-searching algorithm is used to find a pattern in a text.
 * It is done using hashing for eg-> we have to find a pattern(P) in text(T), so we will calculate the hashP and then compare it
 with the hash value of substring in text(T) if matches return else continue.
    Pros
    -> Efficient for multiple pattern searching.
    -> Rolling hash avoids recomputation.

    Cons
    -> Hash collisions can cause false positives → needs verification.

    Real World use case:
    -> Plagiarism detection
    -> Searching DNA sequences
 */
public class RabinKarp {
    static final int d = 256; 

    static void rabinKarpSearch(String pattern, String text, int q){
        int m = pattern.length();
        int n = text.length();
        int i, j, p = 0, t = 0, h = 1;

        // Calculate h = pow(d, m-1) % q
        for(i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }

        for(i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
        }

        
        for(i = 0; i <= n - m; i++) {
            if(p == t) {
                for(j = 0; j < m; j++) {
                    if(text.charAt(i + j) != pattern.charAt(j))
                        break;
                }

                if(j == m) {
                    System.out.println("Pattern found at index " + i);
                }
            }

            if(i < n - m) {
                t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % q;

                if(t < 0) {
                    t = (t + q);
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "ABCDDAEFGHI";
        String pattern = "CDDA";
        int q = 101; 

        rabinKarpSearch(pattern, str, q);
    }
}
