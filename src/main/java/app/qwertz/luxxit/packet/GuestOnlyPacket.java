package app.qwertz.luxxit.packet;

public class GuestOnlyPacket extends LuxPacket {
    private String isGuest;

    public GuestOnlyPacket() {}

    public GuestOnlyPacket(String isGuest) {
        this.isGuest = isGuest;
    }

    @Override
    public String getPrefix() {
        return "ex: ";
    }

    @Override
    public String formatData() {
        return isGuest;
    }

    @Override
    protected void parseData(String dataPart) {
        this.isGuest = dataPart;
    }

    public String getGuestStatus() {
        return isGuest;
    }
}
