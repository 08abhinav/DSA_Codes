import java.util.*;
class T1{
    class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public Node insertNode(Node root, int data){
        if(root == null){
            return new Node(data);
        }
        Node child = root;
        Node parent = null;

        while(child!=null){
            parent = child;
            if(data < child.data){
                child = child.left;
            }else if(data > child.data){
                child = child.right;
            }else{
                System.out.println("Data already present");
            }
        }
        if(parent.data > data){
            parent.left = new Node(data);
        }else{
            parent.right = new Node(data);
        }
        return root;
    }

    public List<Integer> inorderTraversal(Node root) {
    List<Integer> result = new ArrayList<>();
    if (root != null) {
        result.addAll(inorderTraversal(root.left));
        result.add(root.data);
        result.addAll(inorderTraversal(root.right));
    }
    return result;
}

    public List<Integer> preorderTraversal(Node root){
        List<Integer> li = new ArrayList<>();
        if(root!=null){
            li.addAll(preorderTraversal(root.left));
            li.addAll(preorderTraversal(root.right));
            li.add(root.data);
        }
        return li;
    }
    
    public List<Integer> postorderTraversal(Node root){
        List<Integer> li = new ArrayList<>();
        if(root!=null){
            li.add(root.data);
            li.addAll(postorderTraversal(root.left));
            li.addAll(postorderTraversal(root.right));
        }
        return li;
    }
}