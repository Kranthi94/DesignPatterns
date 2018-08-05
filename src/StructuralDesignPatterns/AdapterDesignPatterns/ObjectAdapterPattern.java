package StructuralDesignPatterns.AdapterDesignPatterns;

public class ObjectAdapterPattern implements SocketAdapter{

    private Socket socket = new Socket();

    @Override
    public Volt get120Volts() {
        return socket.getVolts();
    }

    @Override
    public Volt get40Volts() {
        return convertVolts(socket.getVolts(), 3);
    }

    @Override
    public Volt get3Volts() {
        return convertVolts(socket.getVolts(), 40);
    }

    private Volt convertVolts(Volt volt, int reductionSize){
        return new Volt(volt.getVolts()/reductionSize);
    }

}
