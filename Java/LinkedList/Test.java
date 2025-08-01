class Test{
    public static void main(String...str){
        RemoveDuplicate rd = new RemoveDuplicate();
        rd.insert(10);
        rd.insert(10);
        rd.insert(10);
        rd.insert(40);
        rd.insert(50);
        System.out.println("Original List");
        rd.display();

        rd.head = rd.removeDuplicate(rd.head);
        System.out.println("After removing duplicates");
        rd.display();
    }
}