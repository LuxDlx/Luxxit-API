package app.qwertz.luxxit.packet;

import java.util.Arrays;
import java.util.List;

public class GivePlayerCardPacket extends LuxPacket {
    private String countryId;
    private String cardType;
    private String ownerId;

    public GivePlayerCardPacket() {}

    public GivePlayerCardPacket(String countryId, String ownerId, String cardType) {
        this.countryId = countryId;
        this.ownerId = ownerId;
        this.cardType = cardType;
    }

    @Override
    public String getPrefix() {
        return "givePlayerCard: ";
    }

    @Override
    public String formatData() {
        return ownerId + " " + countryId + " " + cardType;
    }

    @Override
    protected void parseData(String dataPart) {
        List<String> parts = splitBySpace(dataPart);
        if (parts.size() != 3) {
            throw new IllegalArgumentException("Expected 3 arguments for GivePlayerCardPacket");
        }
        this.countryId = parts.get(1);
        this.ownerId = parts.get(0);
        this.cardType = parts.get(2);
    }

    public String getCountryId() {
        return countryId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getCardType() {
        return cardType;
    }

    private static List<String> splitBySpace(String str) {
        if (str == null || str.isEmpty()) return java.util.Collections.emptyList();
        return Arrays.asList(str.split(" "));
    }
}
