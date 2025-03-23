#include<stdio.h>
#define max 5

int insert(int);
int delete(int);
void display(int, int);

int main(){
    int ch, arr[max], f=-1, r=-1;
    do{
        printf("1.Insert\n2.Delete\n3.Display\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: r = insert(r);
            if(f==-1){
                f=0;
            }
            break;

            case 2: f = delete(f);
            if(f==r){
                f=r=-1;
            }
            break;

            case 3: display(f, r);
            break;
            
        }
    }while(ch<=3);
}
