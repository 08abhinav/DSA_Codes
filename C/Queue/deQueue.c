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

int insertAtRear(int[], int);
int insertFront(int[], int, int);
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
                        case 1: r = insertAtRear(q, r);
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
                }while(ch2>=1 && ch2<=4);
            break;

            case 2:
            do{
                printf("1.Insertion at rear\n2.Insertion at front\n3.Display\n4.Delete\nEnter your choice: ");
                scanf("%d", &ch3);
                switch(ch3){
                    case 1: r = insertAtRear(q, r);
                    if(f==-1){
                        f=0;
                    }
                    break;

                    case 2: f = insertFront(q, f, r);
                    if(r==-1){
                        r=0;
                    }
                    break;

                    case 3: display(q, f, r);
                    break;

                    case 4: f = delAtFront(q, f);
                    if(f>r){
                        f=r=-1;
                    }
                    break;
                }
            }while(ch3>=1 && ch3<=4);
        }  
    }while(ch>=1 && ch<=2);
}




int insertAtRear(int q[], int r){
    if(r==max-1){
        printf("Queue is full\n");
        return r;
    }else{
        int x;
        printf("Enter the value to insert at rear: ");
        scanf("%d", &x);
        r++;
        q[r] = x;
    }
    return r;
}

int insertFront(int q[], int f, int r){
    if(f==0){
        printf("Queue is full\n");
    }else if(f==-1 && r==-1){
        f++;    
        printf("Enter the value to insert front: ");
        scanf("%d", &q[f]);
    }else{
        int x;
        printf("Enter the value to insert at front: ");
        scanf("%d", &x);
        f--; 
        q[f] = x;
    }
    return f;
}

int delAtRear(int q[], int r){
    if(r==-1){
        printf("Queue is empty\n");
        return r;
    }else{
        printf("Element to be deleted: %d\n", q[r]);
        r--;
    }
    return r;
}

int delAtFront(int q[], int f){
    if(f==-1){
        printf("Queue is empty\n");
        return f;
    }else{
        printf("Element to be deleted: %d\n", q[f]);
        f++;
    }
    return f;
}

void display(int q[], int f, int r){
    if(f==-1 || r==-1){
        printf("Queue is empty\n");
        return;
    }else{
        printf("Element is queue are\n");
        for(int i=f;i<=r;i++){
            printf("%d\t", q[i]);
        }
        printf("\n");
    }
}