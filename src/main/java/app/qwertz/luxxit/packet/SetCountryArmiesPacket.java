package app.qwertz.luxxit.packet;

import java.util.Arrays;
import java.util.List;

public class SetCountryArmiesPacket extends LuxPacket {
    private String countryId;
    private String armies;

    public SetCountryArmiesPacket() {}

    public SetCountryArmiesPacket(String countryId, String armies) {
        this.countryId = countryId;
        this.armies = armies;
    }

    @Override
    public String getPrefix() {
        return "sca: ";
    }

    @Override
    public String formatData() {
        return countryId + " " + armies;
    }

    @Override
    protected void parseData(String dataPart) {
        List<String> parts = splitBySpace(dataPart);
        if (parts.size() != 2) {
            throw new IllegalArgumentException("Expected 2 arguments for SetCountryArmiesPacket");
        }
        this.countryId = parts.get(0);
        this.armies = parts.get(1);
    }

    public String getCountryId() {
        return countryId;
    }

    public String getArmies() {
        return armies;
    }

    private static List<String> splitBySpace(String str) {
        if (str == null || str.isEmpty()) return java.util.Collections.emptyList();
        return Arrays.asList(str.split(" "));
    }
}
