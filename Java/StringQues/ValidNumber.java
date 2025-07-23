/**Given a string s, return whether s is a valid number.

For example, all the following are valid numbers: "2", "0089", "-0.1", "+3.14", "4.", 
"-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789", while the following 
are not valid numbers: "abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53".

Formally, a valid number is defined using one of the following definitions:

An integer number followed by an optional exponent.
A decimal number followed by an optional exponent.
An integer number is defined with an optional sign '-' or '+' followed by digits.

A decimal number is defined with an optional sign '-' or '+' followed by one of the following definitions:

Digits followed by a dot '.'.
Digits followed by a dot '.' followed by digits.
A dot '.' followed by digits.
An exponent is defined with an exponent notation 'e' or 'E' followed by an integer number.

The digits are defined as one or more digits. */
public class ValidNumber {
    public static boolean isNumber(String s){
        s = s.trim();

        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numberSeen = false;
        boolean numberAfterE = true;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                numberSeen = true;
                numberAfterE = true;
            }else if(c == '.'){
                if(pointSeen || eSeen) return false;
                pointSeen = true;
            }else if(c == 'e' || c == 'E'){
                if(eSeen || !numberSeen) return false;
                eSeen = true;
                numberAfterE = false;
            }else if(c == '+' || c == '-'){
                if(i != 0 && s.charAt(i) != 'e' && s.charAt(i) != 'E')return false;
            }else{
                return false;
            }
        }

        return numberSeen && numberAfterE;
    }
    public static void main(String[] args) {
        String str = "-123.456e789";
        String str2 = "99e2.5";
        // System.out.println(ValidNumber.isNumber(str));
        System.out.println(ValidNumber.isNumber(str2));
    }
}
