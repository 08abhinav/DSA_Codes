/* DeQueue (Double ended Queue)
What is a dequeue?
-> A queue where insertion and deletion can be performed 
at both the end (front and rear).
-> Unlike simple queue where insertion is done from rear and deletion
is done from front, dequeue enables insertion and deletion from both the end.

There are two types of dequeue:
-> Input restricted dequeue
    - Insertion at rear
    - Deleteion at rear
    - Deletion at front
-> Output restricted dequeue
    - Insertion at rear
    - Insertion at front
    - Deletion at front
*/

#include<stdio.h>
#define max 5

int insertion(int[], int, int);
int delAtRear(int[], int);
int delAtFront(int[], int);
void display(int[], int , int);

int main(){
    int ch, ch2, ch3, f=-1, r=-1, q[max];
    do{
        printf("1.Input Restricted Queue\n2.Output Restricted Queue\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1:
                do{
                    printf("\n1.Insertion\n2.Display\n3.Deletion at rear\n4.Deletion at front\nEnter your choice: ");
                    scanf("%d", &ch2);
                
                    switch(ch2){
                        case 1: r = insertion(q, f, r);
                        if(f==-1){
                            f=0;
                        }
                        break;

                        case 2: display(q, f, r);
                        break;

                        case 3: r = delAtRear(q, r);
                        if(r<f){
                            r=f=-1;
                        }
                        break;

                        case 4: f = delAtFront(q, f);
                        if(f>r){
                            f=r=-1;
                        }
                        break;
                    }
                }while(ch>=1 && ch<=4);
            break;
        }
    }while(ch>=1 && ch<=2);
}

}