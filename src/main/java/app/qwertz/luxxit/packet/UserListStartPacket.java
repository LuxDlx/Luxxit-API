package app.qwertz.luxxit.packet;

public class UserListStartPacket extends LuxPacket {
    private String data;

    public UserListStartPacket() {}

    public UserListStartPacket(String data) {
        this.data = data;
    }

    @Override
    public String getPrefix() {
        return "userListStart:";
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
