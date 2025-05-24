package app.qwertz.luxxit.packet;

import java.util.Arrays;
import java.util.List;

public abstract class PacketRegistry {
    private static final List<Class<? extends LuxPacket>> PACKETS = Arrays.asList(
            ChatPacket.class,
            ExplosionPacket.class,
            InfoPacket.class,
            StarInfoPacket.class,
            SetCountryOwnerPacket.class,
            SetCountryArmiesPacket.class,
            OptionsPacket.class,
            KillPacket.class,
            GameTurnPacket.class,
            SetGamePhasePacket.class,
            SetGameRoundPacket.class,
            UserListStartPacket.class,
            UserListEndPacket.class,
            QuoteEmotePacket.class,
            HeartEmotePacket.class,
            SingEmotePacket.class,
            ReverseBlueEmotePacket.class,
            LuxConnectPacket.class,
            UserKeyPacket.class,
            RemoteVersionPacket.class,
            IdPacket.class,
            IdTwoPacket.class,
            ClientCommandPacket.class,
            PlayerListPacket.class,
            CInfoPacket.class,
            SelectCountryPacket.class,
            GivePlayerCardPacket.class,
            GuestOnlyPacket.class
    );

    public static List<Class<? extends LuxPacket>> getRegisteredPackets() {
        return PACKETS;
    }
}
