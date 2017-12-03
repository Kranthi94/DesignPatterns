package StructuralDesignPatterns.AdapterDesignPatterns;

public class ClassAdapterPattern extends Socket implements SocketAdapter{

    @Override
    public Volt get120Volts() {
        return getVolts();
    }

    @Override
    public Volt get40Volts() {
        return convertVolts(getVolts(), 3);
    }

    @Override
    public Volt get3Volts() {
        return convertVolts(getVolts(), 40);
    }

    private Volt convertVolts(Volt volt, int reductionSize){
        return new Volt(volt.getVolts()/reductionSize);
    }

}
