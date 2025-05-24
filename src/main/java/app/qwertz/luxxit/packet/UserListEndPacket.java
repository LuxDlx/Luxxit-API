package app.qwertz.luxxit.packet;

public class UserListEndPacket extends LuxPacket {
    private String data;

    public UserListEndPacket() {}

    public UserListEndPacket(String data) {
        this.data = data;
    }

    @Override
    public String getPrefix() {
        return "userListEnd:";
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
