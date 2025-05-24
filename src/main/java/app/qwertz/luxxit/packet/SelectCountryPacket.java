package app.qwertz.luxxit.packet;

public class SelectCountryPacket extends LuxPacket {
    private String country;

    public SelectCountryPacket() {}

    public SelectCountryPacket(String country) {
        this.country = country;
    }

    @Override
    public String getPrefix() {
        return "sc: ";
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
