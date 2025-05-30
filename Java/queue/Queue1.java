import java.util.Scanner;
class Queue1{
    Scanner sc = new Scanner(System.in);
    private int[] q;
    private int size;
    private int f=-1, r=-1;
    Queue1(int n){
        q = new int[n];
        this.size = n;
    }

    void insert(){
        if(r==size-1){
            System.out.print("Queue is full\n");
        }else{
            int x;
            System.out.print("Enter the value to insert: ");
            x = sc.nextInt();
            r += 1;
            q[r] = x;
            if(f==-1){
                f=0;
            }
        }
    }

    void delete(){
        if(f==-1){
            System.out.print("Queue is empty\n");
        }else{
            System.out.print("Popped element: "+q[f]+"\n");
            if(f==r){
                f=r=-1;
            }else{
                f+=1;
            }
        }
    }

    void display(){
        if(f==-1){
            System.out.print("Queue is empty\n");
        }else{
            for(int i=f; i<=r; i++){
                System.out.print(q[i]+"\t");
            }
            System.out.println("");
        }
    }
}