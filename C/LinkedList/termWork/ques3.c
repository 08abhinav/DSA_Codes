#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    int data;
    struct list *next;
}node;

node* insert(node*);
node* removeDuplicates(node*);
void displayList(node *);

int main(){
    node *r=NULL, *h=NULL;
    node *r2=NULL, *h2 = NULL;
    int ch;
    do{
        printf("1.Insert in List\n2.Remove duplicates \n3.Display List\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: r = insert(r);
            if(h==NULL){
                h = r;
            }
            break;

            case 2: r2 = insert(r2);
            if(h2==NULL){
                h2 = r2;
            }
            break;
            case 3: displayList(h);
            break;
        }
    }while(ch>=1 && ch<=3);
}



