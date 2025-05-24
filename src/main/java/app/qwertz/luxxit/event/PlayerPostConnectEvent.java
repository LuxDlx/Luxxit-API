package app.qwertz.luxxit.event;

import app.qwertz.luxxit.player.Player;

public class PlayerPostConnectEvent extends LuxEvent {
    private Player player;

    public PlayerPostConnectEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
