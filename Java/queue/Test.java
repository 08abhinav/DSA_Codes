import java.util.Scanner;

class Test{
    public static void main(String[] args){
        Queue1 q = new Queue1(5);
        Queue2 q2 = new Queue2(5);
        int ch;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("1.Insert\n2.Delete\n3.Display\nEnter your choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1: q2.insert();
                break;

                case 2: q2.delete();
                break;

                case 3: q2.display();
                break;
            }
        }while(ch<=3);
    }
}