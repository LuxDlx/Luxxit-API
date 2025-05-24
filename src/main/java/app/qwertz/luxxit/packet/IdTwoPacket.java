package app.qwertz.luxxit.packet;

public class IdTwoPacket extends LuxPacket {
    private String idTwo;

    public IdTwoPacket() {}

    public IdTwoPacket(String idTwo) {
        this.idTwo = idTwo;
    }

    @Override
    public String getPrefix() {
        return "id2: ";
    }

    @Override
    public String formatData() {
        return idTwo;
    }

    @Override
    protected void parseData(String dataPart) {
        this.idTwo = dataPart;
    }

    public String getIdTwo() {
        return idTwo;
    }
}
