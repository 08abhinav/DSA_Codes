import java.util.List;
import java.util.Scanner;
public class Test {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        T1 t = new T1();
        T1.Node root = null;
        int ch, data;
        do{
            System.out.print("1.Insert into Tree\n"+"2.Inorder Traversal\n"+"3.PostOrder Traversal\n"+"4.PreOrder Traversal\n"+"Enter your choice: ");
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
                    
            }
        }while(ch<=2);
    }
}
