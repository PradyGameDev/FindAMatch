package com.pradyumnashome.findamatch.schemas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Location {
    public static final String INTERNAL_DATE_PATTERN = "yyyy-MM-dd_HHmmss";
    private String name;
    private String sport;
    private int maxPlayers;
    private String uniqueId;
    private ArrayList<Player> playerList;

    public Location(String name, String sport, int maxPlayers) {
        this.name = name;
        this.sport = sport;
        this.maxPlayers = maxPlayers;
        String dateString = new SimpleDateFormat(INTERNAL_DATE_PATTERN).format(Calendar
                                                                                       .getInstance()
                                                                                       .getTime());
        uniqueId = String.format("%s_%s_%f", name, dateString, Math.random());
        playerList = new ArrayList<Player>(maxPlayers);
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }
}
