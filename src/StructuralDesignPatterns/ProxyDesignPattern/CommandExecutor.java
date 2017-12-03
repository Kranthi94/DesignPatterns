package StructuralDesignPatterns.ProxyDesignPattern;

public class CommandExecutor implements CommandInterface{

    @Override
    public void runCommand(String cmd) throws Exception{
        System.out.println(cmd);
    }
}
