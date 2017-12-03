package CreationalPatterns.SingletonPatterns;

// In this pattern we using synchronized method to make sure it creates single instance in multi threaded environment
// we are using double checked locking system due to cost associated with the synchronized method.

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){

    }

    private static ThreadSafeSingleton getInstance(){

        if(instance == null){

            synchronized (ThreadSafeSingleton.class){

                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }
}
