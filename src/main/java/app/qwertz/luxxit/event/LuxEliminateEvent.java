package app.qwertz.luxxit.event;

import app.qwertz.luxxit.packet.LuxPacket;
import app.qwertz.luxxit.player.Player;

public class LuxEliminateEvent extends LuxEvent {
    private Player killer;
    private Player victim;

    public LuxEliminateEvent(Player killer, Player victim) {
        this.killer = killer;
        this.victim = victim;
    }

   public Player getKiller() {
        return killer;
   }

   public Player getVictim() {
        return victim;
   }
}
