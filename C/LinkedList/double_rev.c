// reversing a doubly linked list

#include<stdio.h>
#include<stdlib.h>

typedef struct list{
    struct list* prev;
    int data;
    struct list* next;
}node;

node* insert(node*);
void display(node *);
void reverseList(node *);

int main(){
    node *h = NULL, *r=NULL;
    int ch;
    do{
        printf("1.Insert\n2.Display\n3.Reverse\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: r = insert(r);
            if(h==NULL){
                h = r;
            }
            break;

            case 2: display(h);
            break;

            case 3: reverseList(h);
            break;
        }
    }while(ch>=1 && ch<=3);
}

node* insert(node *r){
    node *ptr = NULL;
    int x;
    ptr = (node*)malloc(sizeof(node));
    if(ptr){
        printf("Enter the value to insert: ");
        scanf("%d", &x);
        ptr->data = x;
        ptr->prev = NULL;
        ptr->next = NULL;
        if(r==NULL){
            r = ptr;
            return r;
        }else{
            ptr->prev = r;
            r->next  = ptr;
            r = ptr;
        }
    }else{
        printf("Memory not allocated\n");
    }
    return r;
}

void display(node *h){
    if(h==NULL){
        printf("List is empty\n");
        return;
    }else{
        node *temp = h;
        while(temp!=NULL){
            printf("%d\t", temp->data);
            temp = temp->next;
        }
        printf("\n");
    }
}

void reverseList(node* head) {
    if (head == NULL) {
        printf("List is empty\n");
        return;
    }

    node* current = head;
    node* temp = NULL;

    while (current != NULL) {
        temp = current->prev;
        current->prev = current->next;
        current->next = temp;
        current = current->prev;  
    }

    if (temp != NULL) {
        head = temp->prev;
    }

    current = head;
    printf("List after reversing:\n");
    while (current != NULL) {
        printf("%d\t", current->data);
        current = current->next;
    }
    printf("\n");
}
