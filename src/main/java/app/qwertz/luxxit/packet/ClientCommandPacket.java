package app.qwertz.luxxit.packet;

public class ClientCommandPacket extends LuxPacket {
    private String command;

    public ClientCommandPacket() {}

    public ClientCommandPacket(String command) {
        this.command = command;
    }

    @Override
    public String getPrefix() {
        return "clientCommand: ";
    }

    @Override
    public String formatData() {
        return command;
    }

    @Override
    protected void parseData(String dataPart) {
        this.command = dataPart;
    }

    public String getCommand() {
        return command;
    }
}
