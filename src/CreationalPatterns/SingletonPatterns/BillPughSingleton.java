package CreationalPatterns.SingletonPatterns;

// In this pattern the static class is not loaded in to the memory until getInstance() method is called and this
// pattern doesn't require synchronization

public class BillPughSingleton {

    private BillPughSingleton(){

    }

    private static class SingletonHelper{

        private static final BillPughSingleton billPughSingleton = new BillPughSingleton();
    }

    private static BillPughSingleton getInstance(){
        return SingletonHelper.billPughSingleton;
    }
}
