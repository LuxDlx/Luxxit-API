package app.qwertz.luxxit.command;

import java.util.Collection;

public interface CommandManager {
    void registerCommand(String name, Command command);
    Collection<Command> getCommands();
}