package app.qwertz.luxxit.plugin;

import app.qwertz.luxxit.server.Server;

public abstract class LuxPlugin implements Plugin {
    private Logger logger;
    private Server server;
    private PluginAttributes pluginAttributes;

    // Called by the plugin manager during plugin loading
    public void init(Logger logger, Server server, PluginAttributes pluginAttributes) {
        this.logger = logger;
        this.server = server;
        this.pluginAttributes = pluginAttributes;
    }

    @Override
    public Logger getLogger() {
        return logger;
    }

    @Override
    public Server getServer() {
        return server;
    }

    @Override
    public PluginAttributes getAttributes() {
        return pluginAttributes;
    }

    public abstract void onEnable();
    public abstract void onDisable();

}
