#include<stdio.h>
#include<stdlib.h>

struct list{
    int data;
    struct list* next;
}typedef node;

node* insert(node*);
void display(node*);

int main(){
    node* head = NULL, *right = NULL;
    int ch;
    do{
        printf("1.Insert\n2.Display\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: right = insert(right);
            if(head == NULL){
                head = right;
            }
            break;

            case 2: display(head);
            break;
        }
    }
}

node* insert(node* right){
    node* ptr = (node*)malloc(sizeof(node));
    if(ptr){
        int x;
        printf("Enter the value to insert: ");
        scanf("%d", x);
        ptr->data = x;
        ptr->next = NULL;
        if(right==NULL){
            right = ptr;
        }else{
            right->next = ptr;
            right = ptr;
        }
        return right;
    }else{
        printf("Memory not allocated\n");
    }
}

void display(node* head){
    if(head){
        printf("Elements of list are\n")
        while(head!=NULL){
            printf("\t%d\t", head->data);
            head = head->next;
        }
        printf("\n");
    }else{
        printf("List is empty\n");
    }
}