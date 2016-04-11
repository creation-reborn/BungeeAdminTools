package fr.Alphart.BAT.Modules.Event;

public class PlayerUnbanEvent extends BATEvent {

    private final String server;
    private boolean ipBan;
    private boolean cancel = false;

    public PlayerUnbanEvent(String target, String server, String staff, String reason, boolean ipBan) {
        setTarget(target);
        setStaff(staff);
        setReason(reason);
        this.server = server;
    }

    public boolean isIPBan() {
        return ipBan;
    }

    public String getServer() {
        return server;
    }

}
