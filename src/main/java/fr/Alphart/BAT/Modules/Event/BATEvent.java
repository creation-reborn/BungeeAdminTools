package fr.Alphart.BAT.Modules.Event;

import net.md_5.bungee.api.plugin.Cancellable;
import net.md_5.bungee.api.plugin.Event;

/**
 * @author James
 */
public class BATEvent extends Event implements Cancellable {
    
    private String target;
    private String staff;
    private String reason;
    private boolean cancel = false;
    
    @Override
    public boolean isCancelled() {
        return cancel;
    }
    
    @Override
    public void setCancelled(boolean bln) {
        cancel = bln;
    }
    
    public String getStaff() {
        return staff;
    }
    
    public String getTarget() {
        return target;
    }
    
    public String getReason() {
        return reason;
    }
    
    protected void setTarget(String target) {
        this.target = target;
    }
    
    protected void setStaff(String staff) {
        this.staff = staff;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    
}
