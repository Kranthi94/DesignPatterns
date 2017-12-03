package StructuralDesignPatterns.ProxyDesignPattern;

public class CommandExecutorProxy implements CommandInterface{

    private boolean isAdmin;

    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String username, String pwd){

        if(username.equalsIgnoreCase("Admin") && pwd.equalsIgnoreCase("password")){
            isAdmin = true;
        }

        commandExecutor = new CommandExecutor();
    }

    @Override
    public void runCommand(String cmd) throws Exception{

        if(isAdmin){
            commandExecutor.runCommand("He is Admin");
        }else {
            if(cmd.startsWith("cmd")){
                throw new Exception("Command Not Executed");
            }else {
                commandExecutor.runCommand("Not Admin");
            }
        }
    }
}
