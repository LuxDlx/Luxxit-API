package app.qwertz.luxxit.packet;

import java.util.Arrays;
import java.util.List;

public class InfoPacket extends LuxPacket {
    private String data;

    public InfoPacket() {}

    public InfoPacket(String data) {
        this.data = data;
    }

    @Override
    public String getPrefix() {
        return "tra: 4 ";
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
