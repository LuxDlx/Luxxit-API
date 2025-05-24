package app.qwertz.luxxit.packet;

import java.util.Arrays;
import java.util.List;

public class LuxConnectPacket extends LuxPacket {
    private String data;

    public LuxConnectPacket() {}

    public LuxConnectPacket(String data) {
        this.data = data;
    }

    @Override
    public String getPrefix() {
        return "LUXCONNECT-6.4:";
    }

    @Override
    public String formatData() {
        return data;
    }

    @Override
    protected void parseData(String dataPart) {
        this.data = dataPart;
    }

    public String getUsername() {
        return data;
    }
}
