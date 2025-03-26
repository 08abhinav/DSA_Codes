import java.util.Scanner;

class Queue3{
    Scanner sc = new Scanner(System.in);
    private int size, f=-1, r=-1;
    private int[] q;
    Queue3(int n){
        q = new int[n];
        this.size = n;
    }
    
    void insertRear(){
        if(f==size-1){
            System.out.print("Queue is full\n");
        }else{
            int x;
            r = size;
            System.out.print("Enter the element to insert: ");
            x = sc.nextInt();
            r --;
            q[r] = x;
        }
    }
}