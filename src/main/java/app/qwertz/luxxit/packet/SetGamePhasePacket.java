package app.qwertz.luxxit.packet;

import java.util.Arrays;
import java.util.List;

public class SetGamePhasePacket extends LuxPacket {
    private String phase;

    public SetGamePhasePacket() {}

    public SetGamePhasePacket(String phase) {
        this.phase = phase;
    }

    @Override
    public String getPrefix() {
        return "setGamePhase: ";
    }

    @Override
    public String formatData() {
        return phase;
    }

    @Override
    protected void parseData(String dataPart) {
        List<String> parts = splitBySpace(dataPart);
        if (parts.size() != 1) {
            throw new IllegalArgumentException("Expected 1 argument for SetGamePhasePacket");
        }
        this.phase = parts.get(0);
    }

    public String getPhase() {
        return phase;
    }

    private static List<String> splitBySpace(String str) {
        if (str == null || str.isEmpty()) return java.util.Collections.emptyList();
        return Arrays.asList(str.split(" "));
    }
}
