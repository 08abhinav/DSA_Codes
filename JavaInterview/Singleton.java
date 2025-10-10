package JavaInterview;

/*Most asked question in java interviews about singleton pattern in java.
 * The purpose of singleton pattern is to ensure that only one instance of a class is created and provide a global
acess point ot that instance.

 * In other words we can say that sometime we need to ensure that a class has only one instance and that
instance is easily accessible from anywhere in our application. 

 * So in singleton pattern design we focus on like our class should only have at most object if we try to create a new
 object it should return that same object only
 * This is where the Singleton Desgin Pattern roles comes to the rescue.
 * Use Case
 -> Logging
 -> Database connectivity
  -> cache
*/

class Singleton{
    private static Singleton instance;

    private Singleton(){}

    // This Solution is not thread Safe
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

