import java.util.Scanner;
class Test{
    public static void main(String... args){
        Stack stk = new Stack(5);
        int ch;
        do{
            Scanner sc = new Scanner(System.in);
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
        }while(ch<=3);
    }
}