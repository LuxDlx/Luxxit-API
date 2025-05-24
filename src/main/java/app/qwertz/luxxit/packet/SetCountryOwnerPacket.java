package app.qwertz.luxxit.packet;

import java.util.Arrays;
import java.util.List;

public class SetCountryOwnerPacket extends LuxPacket {
    private String countryId;
    private String ownerId;

    public SetCountryOwnerPacket() {}

    public SetCountryOwnerPacket(String countryId, String ownerId) {
        this.countryId = countryId;
        this.ownerId = ownerId;
    }

    @Override
    public String getPrefix() {
        return "sco: ";
    }

    @Override
    public String formatData() {
        return countryId + " " + ownerId;
    }

    @Override
    protected void parseData(String dataPart) {
        List<String> parts = splitBySpace(dataPart);
        if (parts.size() != 2) {
            throw new IllegalArgumentException("Expected 2 arguments for SetCountryOwnerPacket");
        }
        this.countryId = parts.get(0);
        this.ownerId = parts.get(1);
    }

    public String getCountryId() {
        return countryId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    private static List<String> splitBySpace(String str) {
        if (str == null || str.isEmpty()) return java.util.Collections.emptyList();
        return Arrays.asList(str.split(" "));
    }
}
