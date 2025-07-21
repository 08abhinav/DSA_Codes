public class DeleteChar{
    public static String makeFancyString(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        sb.append(s.charAt(0));

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)){
                count++;
            } else {
                count = 1;
            }
            if(count <= 2){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "Leeetcode";
        System.out.println(DeleteChar.makeFancyString(s));
    }
}