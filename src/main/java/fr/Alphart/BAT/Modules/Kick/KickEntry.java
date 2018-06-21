package fr.Alphart.BAT.Modules.Kick;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@AllArgsConstructor
public class KickEntry {
    private final String entity;
    private final String server;
    private final String reason;
    private final String staff;
    private final Timestamp date;
}