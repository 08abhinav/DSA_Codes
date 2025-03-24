import java.util.Scanner;
class Test{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack(5);
        int ch;
        do{
            System.out.print("1.Push\n2.Pop\n3.Display\nEnter your choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1: stk.push();
                break;

                case 2: stk.pop();
                break;

                case 3: stk.display();
                break;
            }
        }while(ch<=1 && ch>=3);
    }
}