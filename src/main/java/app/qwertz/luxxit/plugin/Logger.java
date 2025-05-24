package app.qwertz.luxxit.plugin;

public interface Logger {
    void info(String message);
    void severe(String message);
    void warning(String message);
    String getPrefix();
}
