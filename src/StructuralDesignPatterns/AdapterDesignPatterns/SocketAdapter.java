package StructuralDesignPatterns.AdapterDesignPatterns;


public interface SocketAdapter {

    public Volt get120Volts();

    public Volt get40Volts();

    public Volt get3Volts();
}
