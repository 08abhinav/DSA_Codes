import java.util.Scanner;
class Queue2{
    Scanner sc = new Scanner(System.in);
    private int f=-1, r=-1, size;
    private int[] q;
    Queue2(int n){
        q = new int[n];
        this.size = n;
    }

    void insert(){
        if((r+1)%size == size -1){
            System.out.print("Queue is full\n");
        }else{
            int x;
            System.out.print("Enter the element to insert: ");
            x = sc.nextInt();
            if(f==-1){
                f=0;
            }
            r = (r+1)%size;
            q[r] = x;
        }
    }
}