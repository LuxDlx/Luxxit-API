package app.qwertz.luxxit.packet;

public class RemoteVersionPacket extends LuxPacket {
    private String version;

    public RemoteVersionPacket() {}

    public RemoteVersionPacket(String version) {
        this.version = version;
    }

    @Override
    public String getPrefix() {
        return "remote-version: ";
    }

    @Override
    public String formatData() {
        return version;
    }

    @Override
    protected void parseData(String dataPart) {
        this.version = dataPart;
    }

    public String getRemoteVersion() {
        return version;
    }
}
