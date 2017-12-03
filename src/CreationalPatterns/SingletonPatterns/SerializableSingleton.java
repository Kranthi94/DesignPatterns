package CreationalPatterns.SingletonPatterns;

import java.io.ObjectStreamException;
import java.io.Serializable;

// Sometimes we need to read and write data into files and we implement singleton interface to do so. The problem is when we
// serialize and deserialize we will get the new instance of the object. To avoid this we will implement readResolve() method
// returning the previous instance of the class.

public class SerializableSingleton implements Serializable{

    private SerializableSingleton(){

    }

    private static class SingletonHelper {

        private static final SerializableSingleton INSTANCE = new SerializableSingleton();
    }

    public static SerializableSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    private Object readResolve() throws ObjectStreamException{
        return getInstance();
    }
}
