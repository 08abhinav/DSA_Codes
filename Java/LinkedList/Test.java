class Test{
    public static void main(String...str){
        //Singly Linked list
        L1 obj = new L1();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);

        obj.display();

        int x = obj.getMiddle(obj.getHead());
        System.out.println("\nMiddle of linked list: " + x);


        //Doubly Linked list
        // DoublyLinkedList dl = new DoublyLinkedList();
        // int[] arr = {1, 2, 3, 4, 5};

        // DoublyLinkedList.Node head = dl.arrayToDoublyLL(arr);
        // dl.display(head);

        // System.out.println("After Reversing");
        // DoublyLinkedList.Node newHead = dl.reverseDLL(head);
        // dl.display(newHead);
        
    }
}