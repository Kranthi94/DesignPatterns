package CreationalPatterns.FactoryPatterns;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String cpu, String hdd){

        if("PC".equalsIgnoreCase(type)){
            return new PC(ram, cpu, hdd);
        }else if("SERVER".equalsIgnoreCase(type)){
            return new Server(ram, cpu, hdd);
        }

        return null;
    }
}
