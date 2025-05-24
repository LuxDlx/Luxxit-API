package app.qwertz.luxxit.packet;

public class PlayerListPacket extends LuxPacket {
    private String data;

    public PlayerListPacket() {}

    public PlayerListPacket(String data) {
        this.data = data;
    }

    @Override
    public String getPrefix() {
        return "PLAYERLIST:";
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
