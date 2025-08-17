/*
LeetCode Problem number 82 Remove Duplicate from sorted list II
 */
class RemoveDuplicate{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    Node head = null;

    public void insert(int x){
        Node n = new Node(x);
        n.next = null;
        if(head == null){
            head = n;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty\n");
        }else{
            System.out.println("Nodes in list are");
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public Node removeDuplicate(Node head){
        Node dummy = new Node(0);
        Node prev = dummy;

        while(head!=null){
            if(head.next != null && head.data == head.next.data){
                while(head.next != null && head.data == head.next.data){
                    head = head.next;
                }
                prev.next = head.next;
            }else{
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }

}