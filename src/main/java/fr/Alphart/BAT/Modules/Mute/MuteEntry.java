package fr.Alphart.BAT.Modules.Mute;

import java.sql.Timestamp;

public class MuteEntry {
    
    public MuteEntry(String entity, String server, String reason, String staff, Timestamp beginDate, Timestamp endDate, Timestamp unmuteDate, String unmuteReason, String unmuteStaff, boolean active) {
        this.entity = entity;
        this.server = server;
        this.reason = reason;
        this.staff = staff;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.unmuteDate = unmuteDate;
        this.unmuteReason = unmuteReason;
        this.unmuteStaff = unmuteStaff;
        this.active = active;
    }
    
    private final String entity;
    private final String server;
    private final String reason;
    private final String staff;
    private final Timestamp beginDate;
    private final Timestamp endDate;
    private final Timestamp unmuteDate;
    private final String unmuteReason;
    private final String unmuteStaff;
    private final boolean active;
    
    public String getEntity() {
        return entity;
    }
    
    public String getServer() {
        return server;
    }
    
    public String getReason() {
        return reason;
    }
    
    public String getStaff() {
        return staff;
    }
    
    public Timestamp getBeginDate() {
        return beginDate;
    }
    
    public Timestamp getEndDate() {
        return endDate;
    }
    
    public Timestamp getUnmuteDate() {
        return unmuteDate;
    }
    
    public String getUnmuteReason() {
        return unmuteReason;
    }
    
    public String getUnmuteStaff() {
        return unmuteStaff;
    }
    
    public boolean isActive() {
        return active;
    }
}