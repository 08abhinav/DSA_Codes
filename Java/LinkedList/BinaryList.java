import java.util.Scanner;

public class BinaryList {
    public static int getDecimalValue(L1.Node head){
        L1.Node temp = head;
        StringBuilder sb = new StringBuilder();
        while(temp != null){
            sb.append(temp.data);
            temp = temp.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }
    public static void main(String... args) {
       
    }
}
