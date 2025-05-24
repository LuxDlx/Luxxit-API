package app.qwertz.luxxit.packet;

public class KillPacket extends LuxPacket {
    private String data;

    public KillPacket() {}

    public KillPacket(String data) {
        this.data = data;
    }

    @Override
    public String getPrefix() {
        return "KILL:";
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
