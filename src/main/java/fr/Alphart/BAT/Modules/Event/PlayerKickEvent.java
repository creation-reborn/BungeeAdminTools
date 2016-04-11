package fr.Alphart.BAT.Modules.Event;

import net.md_5.bungee.api.plugin.Cancellable;

public class PlayerKickEvent extends BATEvent implements Cancellable {

    private final boolean globalKick;
    private boolean cancel = false;

    public PlayerKickEvent(String target, String staff, String reason, boolean globalKick) {
        setTarget(target);
        setStaff(staff);
        setReason(reason);
        this.globalKick = globalKick;
    }

    public boolean isGlobalKick() {
        return globalKick;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean bln) {
        cancel = bln;
    }

}
