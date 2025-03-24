#include<stdio.h>
#define max 5
int insert(int[], int , int);
int delete(int[], int , int);
void display(int[], int , int);

int main(){
    int q[max], f=-1, r=-1, ch;
    do{
        printf("1.Insert\n2.Delete\n3.Display\nEnter your choice: ");
        scanf("%d",&ch);
        switch(ch){
            case 1: r = insert(q, f, r);
            if(f==-1){
                f=0;
            }
            break;
            case 2:f = delete(q, f, r);
            break;
            case 3: display(q, f, r);
            break;
            default:printf("Not a valid choice\n");
        }
    }while(ch<=3);
}

int insert(int q[max], int f, int r){
    if((r+1)%max==f){
        printf("Queue is full\n");
    }else{
        int x;
        printf("Enter a value to insert: ");
        scanf("%d", &x);
        r = (r+1)%max;
        q[r]=x;
    }
    return r;
}

int delete(int q[max], int f, int r){
    if(f==-1){
        printf("Queue is empty\n");
    }else{
        printf("Popped element is: %d\n", q[f]);
        if(f==r){
            f=r=-1;
        }else{
            f = (f+1)%max;
        }
    }
    return f;
}

void display(int q[max], int f, int r){
    if(f==-1){
        printf("Queue is empty\n");
        return;
    }else{
        printf("Elements inside queue\n");
        int i=f;
        while(1){
            printf("%d\t", q[i]);
            if(i==r){
                break;
            }
            i=(i+1)%max;
        }
        printf("\n");
    }
}