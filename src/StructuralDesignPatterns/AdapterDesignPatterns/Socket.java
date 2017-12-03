package StructuralDesignPatterns.AdapterDesignPatterns;

public class Socket {

    public Volt getVolts(){
        return new Volt(120);
    }
}
