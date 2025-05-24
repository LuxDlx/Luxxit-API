package app.qwertz.luxxit.packet;

public class IdPacket extends LuxPacket {
    private String id;

    public IdPacket() {}

    public IdPacket(String id) {
        this.id = id;
    }

    @Override
    public String getPrefix() {
        return "id: ";
    }

    @Override
    public String formatData() {
        return id;
    }

    @Override
    protected void parseData(String dataPart) {
        this.id = dataPart;
    }

    public String getId() {
        return id;
    }
}
