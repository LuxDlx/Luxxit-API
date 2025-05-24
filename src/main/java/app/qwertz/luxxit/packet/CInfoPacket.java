package app.qwertz.luxxit.packet;

public class CInfoPacket extends LuxPacket {
    private String data;

    public CInfoPacket() {}

    public CInfoPacket(String data) {
        this.data = data;
    }

    @Override
    public String getPrefix() {
        return "CINFO:";
    }

    @Override
    public String formatData() {
        return data;
    }

    @Override
    protected void parseData(String dataPart) {
        this.data = dataPart;
    }

    public String getData() {
        return data;
    }
}
