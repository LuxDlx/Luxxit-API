package app.qwertz.luxxit.packet;

import java.util.Arrays;
import java.util.List;

public class StarInfoPacket extends LuxPacket {
    private String data;

    public StarInfoPacket() {}

    public StarInfoPacket(String data) {
        this.data = data;
    }

    @Override
    public String getPrefix() {
        return "tra: 3 ";
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
