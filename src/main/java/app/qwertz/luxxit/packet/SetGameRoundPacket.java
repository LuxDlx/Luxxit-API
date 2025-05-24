package app.qwertz.luxxit.packet;

import java.util.Arrays;
import java.util.List;

public class SetGameRoundPacket extends LuxPacket {
    private String round;

    public SetGameRoundPacket() {}

    public SetGameRoundPacket(String round) {
        this.round = round;
    }

    @Override
    public String getPrefix() {
        return "setGameRound: ";
    }

    @Override
    public String formatData() {
        return round;
    }

    @Override
    protected void parseData(String dataPart) {
        List<String> parts = splitBySpace(dataPart);
        if (parts.size() != 1) {
            throw new IllegalArgumentException("Expected 1 argument for SetGameRoundPacket");
        }
        this.round = parts.get(0);
    }

    public String getRound() {
        return round;
    }

    private static List<String> splitBySpace(String str) {
        if (str == null || str.isEmpty()) return java.util.Collections.emptyList();
        return Arrays.asList(str.split(" "));
    }
}
