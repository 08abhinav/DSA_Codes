/**Converting a string to Camel Case */
public class CamelCase{
    public static String convertToCamelCase(String s){
        if(s == null) return "";
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(words[0]);
        for(int i=1;i<words.length;i++){
            if(!words[i].isEmpty()){
                sb.append(Character.toUpperCase(words[i].charAt(0)))
                .append(words[i].substring(1));
            }
        }
        return sb.toString();
    }

    public static void main(String...arg){
        String str = "hello world this is java sample code";
        System.out.println(CamelCase.convertToCamelCase(str));
    }
}