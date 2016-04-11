package fr.Alphart.BAT.Modules.Event;

public class PlayerBanEvent extends BATEvent {
    
    
    private final String server;
    private final long expirationTimestamp;
    private boolean ipBan;

    public PlayerBanEvent(String target, String server, String staff, long expirationTimestamp, String reason, boolean ipBan) {
        setTarget(target);
        setStaff(staff);
        setReason(reason);
        this.server = server;
        this.expirationTimestamp = expirationTimestamp;
    }

    public boolean isIPBan() {
        return ipBan;
    }
    
    public long getExpirationTimestamp() {
        return expirationTimestamp;
    }
    
    public boolean isTempBan()
    {
        return expirationTimestamp > 0;
    }

    public String getServer() {
        return server;
    }

}
