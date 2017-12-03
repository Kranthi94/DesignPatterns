package CreationalPatterns.SingletonPatterns;

// In this pattern the instance of the class is created at class loading itself

// Drawback is instance is created event though we are not using it

public class EagerInitialization {

    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization(){

    }

    public static EagerInitialization getInstance(){
        return instance;
    }
}
