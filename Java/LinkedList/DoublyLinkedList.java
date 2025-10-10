class DoublyLinkedList{
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int val){
            data = val;
            next = null;
            prev = null;
        }

        public Node(int data1, Node next1, Node prev1){
            data = data1;
            next = next1;
            prev = prev1;
        }
    }

    public Node arrayToDoublyLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public Node reverseDLL(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node prev = null;
        Node curr = head;

        while(curr != null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        return prev.prev;
    }
    
    public void display(Node head){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}