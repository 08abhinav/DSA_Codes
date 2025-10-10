package JavaInterview;

/*Most asked question in java interviews about singleton pattern in java.
 * The purpose of singleton pattern is to ensure that only one instance of a class is created and provide a global
acess point ot that instance.

 * In other words we can say that sometime we need to ensure that a class has only one instance and that
instance is easily accessible from anywhere in our application. 

 * This is where the Singleton Desgin Pattern roles comes to the rescue.
*/

class Singleton{
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

