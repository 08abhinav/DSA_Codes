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
        if((r+1)%size==f){
            System.out.print("Queue is full\n");
        }else{
            int x;
            System.out.print("Enter the value to insert: ");
            x = sc.nextInt();
            r = (r+1)%size;
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
            System.out.print("Delete item: "+q[f]+"\n");
            if(f==r){
                f=r=-1;
            }else{
                f = (f+1)%size;
            }
        }
    }

    void display(){
        if(f==-1){
            System.out.print("Queue is empty\n");
        }else{
            int i=f;
            while(true){
                System.out.print(q[i]+"\t");
                if(i==r){
                    break;
                }
                i = (i+1)%size;
            }
            System.out.print("\n");
        }
    }
}