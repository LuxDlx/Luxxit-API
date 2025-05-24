package app.qwertz.luxxit.packet;

public class UserKeyPacket extends LuxPacket {
    private String regCode;

    public UserKeyPacket() {}

    public UserKeyPacket(String regCode) {
        this.regCode = regCode;
    }

    @Override
    public String getPrefix() {
        return "userKey: ";
    }

    @Override
    public String formatData() {
        return regCode;
    }

    @Override
    protected void parseData(String dataPart) {
        this.regCode = dataPart;
    }

    public String getRegCode() {
        return regCode;
    }
}
