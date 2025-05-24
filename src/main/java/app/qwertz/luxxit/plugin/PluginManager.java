package app.qwertz.luxxit.plugin;

import java.io.File;
import java.util.Collection;

public interface PluginManager {
    LuxPlugin getPlugin(String name);
    Collection<LuxPlugin> getPlugins();
    void loadPlugin(File jarFile) throws Exception;
}
