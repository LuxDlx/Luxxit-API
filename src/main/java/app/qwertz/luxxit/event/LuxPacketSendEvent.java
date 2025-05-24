package app.qwertz.luxxit.event;

import app.qwertz.luxxit.packet.LuxPacket;
import app.qwertz.luxxit.player.Player;

public class LuxPacketSendEvent extends LuxEvent {
    private Player receiver;
    private LuxPacket packet;

    public LuxPacketSendEvent(Player receiver, LuxPacket packet) {
        this.packet = packet;
        this.receiver = receiver;
    }

    public Player getReceiver() {
        return receiver;
    }

    public LuxPacket getPacket() {
        return packet;
    }

    public void setPacket(LuxPacket packet) {
        this.packet = packet;
    }
}
