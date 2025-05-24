package app.qwertz.luxxit.packet;

import java.util.Collections;
import java.util.List;

public class OptionsPacket extends LuxPacket {
    private String data;

    public OptionsPacket() {}

    public OptionsPacket(String data) {
        this.data = data;
    }

    @Override
    public String getPrefix() {
        return "OPS:";
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
