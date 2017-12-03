package StructuralDesignPatterns.ProxyDesignPattern;

public class TestProxyPattern {

    public static void main(String[] args) throws Exception {

        CommandExecutorProxy commandExecutorProxy = new CommandExecutorProxy("Admin", "passwor");

        commandExecutorProxy.runCommand("Full");
    }
}
