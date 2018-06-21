package fr.Alphart.BAT.Modules.Ban;

import java.sql.Timestamp;

public class BanEntry {
    
    public BanEntry(String entity, String server, String reason, String staff, Timestamp beginDate, Timestamp endDate, Timestamp unbanDate, String unbanReason, String unbanStaff, boolean active) {
        this.entity = entity;
        this.server = server;
        this.reason = reason;
        this.staff = staff;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.unbanDate = unbanDate;
        this.unbanReason = unbanReason;
        this.unbanStaff = unbanStaff;
        this.active = active;
    }
    
    private final String entity;
    private final String server;
    private final String reason;
    private final String staff;
    private final Timestamp beginDate;
    private final Timestamp endDate;
    private final Timestamp unbanDate;
    private final String unbanReason;
    private final String unbanStaff;
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
    
    public Timestamp getUnbanDate() {
        return unbanDate;
    }
    
    public String getUnbanReason() {
        return unbanReason;
    }
    
    public String getUnbanStaff() {
        return unbanStaff;
    }
    
    public boolean isActive() {
        return active;
    }
}