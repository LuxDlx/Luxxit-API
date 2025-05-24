package app.qwertz.luxxit.server;

import app.qwertz.luxxit.command.CommandManager;
import app.qwertz.luxxit.plugin.PluginManager;
import app.qwertz.luxxit.event.EventManager;
import app.qwertz.luxxit.packet.LuxPacket;
import app.qwertz.luxxit.player.Player;
import java.util.Collection;

public interface Server {
    EventManager getEventManager();
    PluginManager getPluginManager();
    Collection<Player> getAllPlayers();
    Player getPlayer(String name);
    Player getPlayerByIp(String ip);
    Player getPlayerByRegCode(String regCode);
    CommandManager getCommandManager();
    void broadcast(String message);
    void broadcast(LuxPacket packet);
}
