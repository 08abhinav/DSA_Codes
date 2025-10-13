import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node {
    int data;
    Node left;
    Node right;
    
    Node(int x){
        data = x;
        left = null;
        right = null;
    }
}

public class T2{
    // Preorder Traversal of a binary tree
    public List<Integer> preOrder(Node root){
        Stack<Node> stk = new Stack<>();
        List<Integer> res = new ArrayList<>();

        if(root == null) return res;
        stk.push(root);

        while(!stk.isEmpty()){
            root = stk.pop();
            res.add(root.data);

            if(root.left != null){
                stk.push(root.left);
            }
            if(root.right != null){
                stk.push(root.right);
            }
        }
        return res;
    }
}