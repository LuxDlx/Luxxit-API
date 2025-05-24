package app.qwertz.luxxit.event;

import app.qwertz.luxxit.packet.LuxPacket;
import app.qwertz.luxxit.player.Player;

public class PlayerPreConnectEvent extends LuxEvent {
    private Player player;

    public PlayerPreConnectEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
