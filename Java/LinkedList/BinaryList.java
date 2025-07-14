/**Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list. */
import java.util.Scanner;

public class BinaryList {
    // public static int getDecimalValue(L1.Node head){
    //     L1.Node temp = head;
    //     StringBuilder sb = new StringBuilder();
    //     while(temp != null){
    //         sb.append(temp.data);
    //         temp = temp.next;
    //     }
    //     return Integer.parseInt(sb.toString(), 2);
    // }

    //Method 2
    public static int getDecimalValue(L1.Node head){
        int res = head.data;
        L1.Node temp = head.next;
        while(temp != null){
            res = res * 2 + temp.data;
            temp = temp.next;
        }
        return res;
    }
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        L1 list = new L1(); 

        int ch;
        do {
            System.out.print("1. Insert binary values\n2. Convert binary to decimal\n3. Exit\nEnter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter binary digit (0 or 1): ");
                    int x = sc.nextInt();
                    if (x == 0 || x == 1) {
                        list.insert(x);
                    } else {
                        System.out.println("Only binary digits allowed!");
                    }
                    break;
                case 2:
                    int result = getDecimalValue(list.getHead());
                    System.out.println("Decimal value: " + result);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (ch != 3);

        sc.close();
    }
}
