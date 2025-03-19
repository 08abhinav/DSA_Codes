#include<stdio.h>
#include<stdlib.h>
struct CircularList{
    int data;
    struct list *next;
}typedef node;

node* insert(node*);
node* delete(node*);
void display(node*);

int main(){
    node *last=NULL;
    int ch;
    do{
        printf("1.Insert\n2.Delete\n3.Display\nEnter you choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: last = insert(last);
            break;
            case 2: last = delete(last);
            break;
            case 3: display(last);
            break;
        }
    }while(ch<=3);
}

node* insert(node *last){
    node *ptr=NULL;
    ptr = (node*)malloc(sizeof(node));
    if(ptr!=NULL){
        int x;
        printf("Enter the value to insert: ");
        scanf("%d", &x);
        ptr->data = x;
        if(last==NULL){
            last=ptr;
            last->next=ptr;
        }else{
            ptr->next = last->next;
            last->next = ptr;
            last = ptr;
        }
    }else{
        printf("Memory not allocated\n");
    }
    return last;
}

node* delete(node *last) {
    if(last == NULL) {
        printf("List is empty\n");
        return NULL;
    }

    node *temp = last->next;
    if(last == last->next) { 
        printf("Deleted node is: %d\n", temp->data);
        free(temp);
        return NULL;
    }

    printf("Deleted node is: %d\n", temp->data);
    last->next = temp->next;
    free(temp);
    return last;
}

void display(node *last) {
    if(last == NULL) {
        printf("List is empty\n");
        return;
    }

    node *temp = last->next;
    printf("Elements in the list: ");
    do {
        printf("%d ", temp->data);
        temp = temp->next;
    } while(temp != last->next);
    printf("\n");
}