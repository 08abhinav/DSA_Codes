public class L1{
    static class Node{
        int data;
        Node next;
    }
    Node head = null;
    
    public void insert(int x){
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
}