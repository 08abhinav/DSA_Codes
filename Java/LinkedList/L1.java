import java.util.Scanner;
class L1{
    // Node node;
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

    public void display(){
        if(head.next == null){
            System.out.print("List is empty\n");
        }else{
            Node temp = head;
            System.out.print("Nodes are\n");
            while(temp.next != null){
                System.out.print(temp.data+"\t");
                temp = temp.next;
            }
        }
    }
}