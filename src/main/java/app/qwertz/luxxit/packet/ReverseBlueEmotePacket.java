package app.qwertz.luxxit.packet;

public class ReverseBlueEmotePacket extends LuxPacket {
    private String username;
    private String message;

    public ReverseBlueEmotePacket() {}

    public ReverseBlueEmotePacket(String username, String message) {
        this.username = username;
        this.message = message;
    }

    @Override
    public String getPrefix() {
        return "ZMOTE: ";
    }

    @Override
    public String formatData() {
        return username + " " + message;
    }

    @Override
    protected void parseData(String dataPart) {
        int firstSpace = dataPart.indexOf(' ');
        if (firstSpace == -1) {
            throw new IllegalArgumentException("Invalid emote format");
        }
        username = dataPart.substring(0, firstSpace);
        message = dataPart.substring(firstSpace + 1);
    }

    public String getUsername() {
        return username;
    }

    public String getMessage() {
        return message;
    }
}
