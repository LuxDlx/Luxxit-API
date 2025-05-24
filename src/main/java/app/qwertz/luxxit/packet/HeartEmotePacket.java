package app.qwertz.luxxit.packet;

public class HeartEmotePacket extends LuxPacket {
    private String username;
    private String message;

    public HeartEmotePacket() {}

    public HeartEmotePacket(String username, String message) {
        this.username = username;
        this.message = message;
    }

    @Override
    public String getPrefix() {
        return "HMOTE: ";
    }

    @Override
    public String formatData() {
        return username + " " + message;
    }

    @Override
    protected void parseData(String dataPart) {
        int spaceIndex = dataPart.indexOf(' ');
        if (spaceIndex == -1) {
            throw new IllegalArgumentException("Invalid HeartEmote packet format");
        }
        this.username = dataPart.substring(0, spaceIndex);
        this.message = dataPart.substring(spaceIndex + 1);
    }

    public String getUsername() {
        return username;
    }

    public String getMessage() {
        return message;
    }
}
