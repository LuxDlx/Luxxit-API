package app.qwertz.luxxit.packet;

import java.util.Arrays;
import java.util.List;

public class GameTurnPacket extends LuxPacket {
    private String turn;

    public GameTurnPacket() {}

    public GameTurnPacket(String turn) {
        this.turn = turn;
    }

    @Override
    public String getPrefix() {
        return "gt: ";
    }

    @Override
    public String formatData() {
        return turn;
    }

    @Override
    protected void parseData(String dataPart) {
        List<String> parts = splitBySpace(dataPart);
        if (parts.size() != 1) {
            throw new IllegalArgumentException("Expected 1 argument for GameTurnPacket");
        }
        this.turn = parts.get(0);
    }

    public String getTurn() {
        return turn;
    }

    private static List<String> splitBySpace(String str) {
        if (str == null || str.isEmpty()) return java.util.Collections.emptyList();
        return Arrays.asList(str.split(" "));
    }
}
