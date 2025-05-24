package app.qwertz.luxxit.plugin;

import app.qwertz.luxxit.event.EventManager;
import app.qwertz.luxxit.server.Server;

public interface Plugin {
    void onEnable();

    void onDisable();

    Logger getLogger();

    Server getServer();

    PluginAttributes getAttributes();
}
