import java.util.Stack;

public class L1{
    static class Node{
        int data;
        Node next;
    }
    Node head = null;
    
    public Node insert(int x){
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = null;

        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

    public Node getHead(){
        return head;
    }

    public void display(){
        if(head == null){
            System.out.print("List is empty\n");
        }else{
            Node temp = head;
            System.out.print("Nodes are\n");
            while(temp != null){
                System.out.print(temp.data+"\t");
                temp = temp.next;
            }
        }
    }

    public void delete(Node node){
        node.data = node.next.data;
        node.next = node.next.next;
        System.out.println("Node deleted");
        display();
    }

    // Using iteration method
    public void reverse(){
        if(head == null){
            return ;
        }
        Node curr = head;
        Node prev = null;

        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        display();
    }

    // Using recursion
    public Node reverseRecurr(Node node){
        if(node == null || node.next == null){
            head = node;
            return node;
        }

        Node newNode = reverseRecurr(node.next);
        node.next.next = node;
        node.next = null;

        return newNode;
    }

    // 876. Leetcode problem to find middle of a linked list
    public int getMiddle(Node node){
        if(node == null || node.next == null){
            return node.data;
        }
        Node slow = node;
        Node fast = node;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public boolean isPalindrome(Node node){
        Stack<Integer> stk = new Stack<>();
        Node temp = node;
        while(temp != null){
            stk.push(temp.data);
            temp = temp.next;
        }
        temp = node;
        while(temp != null && stk.pop() == temp.data){
            temp = temp.next;
        }
        return temp == null;
    }

    
}