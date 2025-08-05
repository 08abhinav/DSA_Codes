public class FruitsIntoBask{
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets){
        int c = 0;
        for(int i = 0; i < fruits.length; i++){
            for(int j = 0; j < baskets.length; j++){
                if(fruits[i] <= baskets[j]){
                    c++;
                    baskets[j] = 0;
                    break;
                }
            }
        }
        return fruits.length - c;
    }
    public static void main(String[] args) {
        int[] fruits = {4, 2, 5};
        int[] baskets = {3, 5, 4};
        System.out.println(FruitsIntoBask.numOfUnplacedFruits(fruits, baskets));
    }
}