/*
2591. Distribute Money to Maximum Children
You are given an integer money denoting the amount of money (in dollars) that you have and another integer 
children denoting the number of children that you must distribute the money to.
You have to distribute the money according to the following rules:

All money must be distributed.
Everyone must receive at least 1 dollar.
Nobody receives 4 dollars.
Return the maximum number of children who may receive exactly 8 dollars if you distribute the money according 
to the aforementioned rules. If there is no way to distribute the money, return -1. */
public class DistributeMoney {
    public static int distMoney(int money, int children){
        money -= children;

        if(money / 7 == children && money % 7 == 0){
            return children;
        }

        if(money / 7 == children - 1 && money % 7 == 3){
            return children - 2;
        }

        return Math.min(children - 1, money / 7);
    }
    public static void main(String...args){
        int money = 20, children = 3;
        System.out.println(distMoney(money, children));
    }
}
