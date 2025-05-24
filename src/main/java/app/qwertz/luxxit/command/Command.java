package app.qwertz.luxxit.command;

import app.qwertz.luxxit.player.Player;

public interface Command {
    String getName();
    String getDescription();
    String getUsage();
    boolean execute(Player sender, String label, String[] args);
}
