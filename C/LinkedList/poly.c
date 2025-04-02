/* Polynomial execution using linked list
eg- given to us 2x^3+5x^2+7x+10
so we have to solve this polynomial equation using linked list

***IMPORTANT POINTS:
-> if exponent is greater than the existing exponent it should
be before the smallest exponent

-> if exponent is smaller thant the existing exponent then it 
should be after the greater exponent

-> if exponent already exist and user insert the same exponent
it should not inserted in list

-> there should be three function 1.Insert 2.Display 3.Evaluate
*/

#include<stdio.h>
#include<stdlib.h>
#include<math.h>

struct list{
    int data, expo;
    struct list *next;
}typedef node;

void insert(node **, node **);
void display(node **);
void evaluate(node **);

int main(){
    node *l=NULL, *r=NULL;
    int ch;
    do{
        printf("1.Insert\n2.Display\n3.Evaluate\nEnter your choice: ");
        scanf("%d", &ch);
        switch(ch){
            case 1: insert(&l, &r);
            break;
            case 2: display(&l);
            break;
            case 3: evaluate(&l);
            break;
        }
    }while(ch<=3);
}

void insert(node **l, node **r){
    node *ptr = NULL;
    ptr = (node *)malloc(sizeof(node));
    if(!ptr){
        printf("Memory not allocated\n");
    }else{
        int x, y;
        printf("Enter the coefficient: ");
        scanf("%d", &x);
        printf("Enter the exponent: ");
        scanf("%d", &y);
        ptr->data = x;
        ptr->expo = y;
        ptr->next = NULL;
        if(*l==NULL && *r==NULL){
            *l = *r = ptr;
        }else{
            (*r)->next = ptr;
            *r = ptr;
        }
    }
}

void display(node **l){
    if(*l==NULL){
        printf("List is empty\n");
    }else{
        node *temp = *l;
        while(temp!=NULL){
            printf("%d - %d\t", temp->data, temp->expo);
            temp = temp->next;
        }
        printf("\n");
    }
}

void evaluate(node **l){
    if(*l==NULL){
        printf("List is empty\n");
    }else{
        node *temp = *l;
        int sum=0, x;
        printf("Enter the value of x: ");
        scanf("%d", &x);
        while(temp!=NULL){
            sum += (pow(x, temp->expo)*temp->data);
            temp = temp->next;
        }
        printf("Evaluated value: %d\n", sum);
    }
}