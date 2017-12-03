package CreationalPatterns.SingletonPatterns;

// The above implementation works fine in case of single threaded environment but in case of multi threaded environment if
// both the threads come at same time inside the if loop then two instances of the class are created.


public class LazyInitialization {

    private static LazyInitialization instance;

    private LazyInitialization(){

    }

    public static LazyInitialization getInstance(){

        if(instance == null){
            instance = new LazyInitialization();
        }

        return instance;
    }
}
