package app.qwertz.luxxit.packet;

public class ExplosionPacket extends LuxPacket {
    private String country;

    public ExplosionPacket() {}

    public ExplosionPacket(String country) {
        this.country = country;
    }

    @Override
    public String getPrefix() {
        return "ex: ";
    }

    @Override
    public String formatData() {
        return country;
    }

    @Override
    protected void parseData(String dataPart) {
        this.country = dataPart;
    }

    public String getCountryId() {
        return country;
    }
}
