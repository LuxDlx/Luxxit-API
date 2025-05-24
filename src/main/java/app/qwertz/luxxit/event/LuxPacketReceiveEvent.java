package app.qwertz.luxxit.event;

import app.qwertz.luxxit.packet.LuxPacket;
import app.qwertz.luxxit.player.Player;

public class LuxPacketReceiveEvent extends LuxEvent {
    private Player sender;
    private LuxPacket packet;

    public LuxPacketReceiveEvent(Player sender, LuxPacket packet) {
        this.packet = packet;
        this.sender = sender;
    }

    public Player getSender() {
        return sender;
    }

    public LuxPacket getPacket() {
        return packet;
    }

    public void setPacket(LuxPacket packet) {
        this.packet = packet;
    }
}
