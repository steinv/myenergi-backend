package com.stein.myenergi.database.entities;

import com.stein.myenergi.api.dto.HistoryDay;

import java.io.Serializable;
import java.util.Date;


public class HistoryEntity implements Serializable {

    // date in long format
    private Long date;
    // zappi serial
    private String serial;
    // electricity in joules imported from the net
    private int imported;
    // electricity in joules exported to the net
    private int exported;

    // electricity in joules generated by solar panels
    private int generated;

    // electricity in joules charged into electrical vehicle
    private int charged;

    // electricity in joules consumed
    private int consumed;

    public HistoryEntity() {
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getImported() {
        return imported;
    }

    public void setImported(int imported) {
        this.imported = imported;
    }

    public int getExported() {
        return exported;
    }

    public void setExported(int exported) {
        this.exported = exported;
    }

    public int getGenerated() {
        return generated;
    }

    public void setGenerated(int generated) {
        this.generated = generated;
    }

    public int getCharged() {
        return charged;
    }

    public void setCharged(int charged) {
        this.charged = charged;
    }

    public int getConsumed() {
        return consumed;
    }

    public void setConsumed(int consumed) {
        this.consumed = consumed;
    }
}
