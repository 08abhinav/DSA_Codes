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
        }
    }while(ch<=2);
}