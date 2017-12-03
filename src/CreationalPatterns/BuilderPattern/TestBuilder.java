package CreationalPatterns.BuilderPattern;

public class TestBuilder {

    public static void main(String[] args){

        Computer computer = new Computer.ComputerBuilder("12", "512").setRamEnabled(true).setHDDEnabled(true).build();

        System.out.println(computer.toString());
    }
}
