import java.util.Scanner;
class T1{
    class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public Node insertBST(Node root, int data){
        Node curr = root;
        while(true){
            if(curr == null){
                curr.data = data;
                curr.left = null;
                curr.right = null;
            }
            else if(curr.data > data){
                if(curr.left == null){
                    curr.left = new Node(data);
                    break;
                }else{
                    curr = curr.left;
                }
            }else if(curr.data < data){
                if(curr.right == null){
                    curr.right  =new Node(data);
                    break;
                }else{
                    curr = curr.right;
                }
            }else{
                System.out.println("Data already present");
                break;
            }
        }
        return root;
    }
}