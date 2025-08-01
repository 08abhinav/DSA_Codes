import java.util.List;
import java.util.Scanner;
public class Test {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        T1 t = new T1();
        T1.Node root = null;
        int ch, data;
        do{
            System.out.print("1.Insert into Tree\n2.Inorder Traversal\n3.PostOrder Traversal\n4.PreOrder Traversal\n5.Level Order Traversal\nEnter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the value to insert: ");
                    data = sc.nextInt();
                    root = t.insertNode(root, data);
                    break;
            
                case 2: 
                    List<Integer> li = t.inorderTraversal(root);
                    System.out.println("Inorder Traversal: "+li);
                    break;

                case 3: 
                    List<Integer> li2 = t.preorderTraversal(root);
                    System.out.println("Inorder Traversal: "+li2);
                    break;

                case 4: 
                List<Integer> li3 = t.postorderTraversal(root);
                System.out.println("Inorder Traversal: "+li3);
                break;

                case 5: 
                List<List<Integer>> li4 = t.levelOrder(root);
                System.out.println("Inorder Traversal: "+li4);
                break;
            }
        }while(ch>=1 && ch<=5);
    }
}
