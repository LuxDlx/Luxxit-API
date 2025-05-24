package app.qwertz.luxxit.player;

import app.qwertz.luxxit.packet.LuxPacket;

public interface Player {
    String getName();
    String getRegCode();
    String getIp();
    void disconnect();
    void send(String message);
    void send(LuxPacket packet);
    boolean isMod();
    void setMod(boolean mod);
}