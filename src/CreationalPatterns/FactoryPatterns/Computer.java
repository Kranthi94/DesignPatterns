package CreationalPatterns.FactoryPatterns;

public abstract class Computer {

    public abstract String getRam();

    public abstract String getCPU();

    public abstract String getHDD();

    public String toString(){
        return "RAM : " + getRam() + " CPU : " + getCPU() + " HDD : " + getHDD();
    }
}
