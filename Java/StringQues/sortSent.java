/*Give a string with numbers we have to sort the string according the place of that number */
class SortSent{
    public String sortSentence(String s){
        String[] str = s.split(" ");
        String[] res = new String[str.length];

        for(String word: str){
            int i = word.length()-1;
            res[word.charAt(i)-'1'] = word.substring(0, i);
        }

        return String.join(" ", res);
    }
}