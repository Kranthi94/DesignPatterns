package CreationalPatterns.FactoryPatterns;

import java.util.Objects;

public class TestFactory {

    public static void main(String[] args){

        Computer pc = ComputerFactory.getComputer("PC", "12", "OctaCore", "512");

        Computer server = ComputerFactory.getComputer("SERVER", "12", "OctaCore", "512");

        System.out.println("Factory PC Config " + pc.toString());

        System.out.println("Sever PC Config " + server.toString());
    }
}
