package app.qwertz.luxxit.packet;

public abstract class LuxPacket {
    /**
     * Returns the string prefix identifying this packet type, e.g. "chat: "
     */
    public abstract String getPrefix();

    /**
     * Returns the string representation of the packet data (excluding prefix)
     */
    public abstract String formatData();

    /**
     * Returns the full stringified packet (prefix + data)
     */
    public String stringify() {
        return getPrefix() + formatData();
    }

    /**
     * Factory method to parse a raw string into the correct LuxPacket subclass
     */
    public static LuxPacket fromString(String input) {
        for (Class<? extends LuxPacket> packetClass : PacketRegistry.getRegisteredPackets()) {
            try {
                LuxPacket instance = packetClass.getDeclaredConstructor().newInstance();
                if (input.startsWith(instance.getPrefix())) {
                    String dataPart = input.substring(instance.getPrefix().length());
                    instance.parseData(dataPart);
                    return instance;
                }
            } catch (Exception e) {
                // Ignore instantiation errors here
            }
        }
        throw new IllegalArgumentException("Unknown packet prefix: " + input);
    }

    protected abstract void parseData(String dataPart);
}
