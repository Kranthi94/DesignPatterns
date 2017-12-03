package CreationalPatterns.SingletonPatterns;

// In this pattern the instance is created in static block which is called during class initialization
// and provides option for exception handling

// Drawback is instance is created event though we are not using it

public class StaticBlockInitialization {

    private static StaticBlockInitialization instance;

    static {
        try{
            instance = new StaticBlockInitialization();
        }catch (Exception e){
            throw new RuntimeException("Unable to create instance");
        }

    }

    private StaticBlockInitialization(){

    }

    public static StaticBlockInitialization getInstance(){
        return instance;
    }
}
