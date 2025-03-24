import java.util.Scanner;
public class Stack{
    Scanner sc = new Scanner(System.in);
    private int top = -1;
    private int max;
    private int[] stk;
    Stack(int num){
        stk = new int[num];
        this.max = num;
    }

    void push(){
        if(top==max-1){
            System.out.print("Stack overflow\n");
        }else{
            int x;
            System.out.print("Enter the value to push: ");
            x = sc.nextInt();
            top += 1;
            stk[top] = x;
        }
    }

    void pop(){
        if(top==-1){
            System.out.print("Stack underflow\n");
        }else{
            System.out.print("Popped item: "+stk[top]+"\n");
            top -= 1;
        }
    }

    void display(){
        if(top==-1){
            System.out.print("Queue is empty\n");
        }else{
            System.out.print("Items in stack\n");
            for(int i: stk){
                System.out.print("\t"+i);
            }
            System.out.println("");
        }
    }
}