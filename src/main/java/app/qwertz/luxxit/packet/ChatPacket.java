package app.qwertz.luxxit.packet;

public class ChatPacket extends LuxPacket {
    private String username;
    private String message;

    public ChatPacket() {
        // Empty constructor for factory
    }

    public ChatPacket(String username, String message) {
        this.username = username;
        this.message = message;
    }

    @Override
    public String getPrefix() {
        return "CHAT: ";
    }

    @Override
    public String formatData() {
        return username + ": " + message;
    }

    @Override
    protected void parseData(String dataPart) {
        int idx = dataPart.indexOf(": ");
        if (idx == -1) {
            throw new IllegalArgumentException("Invalid chat packet format");
        }
        this.username = dataPart.substring(0, idx);
        this.message = dataPart.substring(idx + 2);
    }

    // Getters for convenience
    public String getUsername() {
        return username;
    }

    public String getMessage() {
        return message;
    }
}
