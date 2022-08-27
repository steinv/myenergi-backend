package com.stein.myenergi.database.entities;

import com.stein.myenergi.api.dto.HistoryDay;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "history")
@Table(name = "history")
public class HistoryEntity implements Serializable {

    @EmbeddedId
    private HistoryId id;

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

    // original data from api
    private HistoryDay[] history;

    public HistoryEntity() {
    }

    public HistoryId getId() {
        return id;
    }

    public void setId(HistoryId id) {
        this.id = id;
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

    public HistoryDay[] getHistory() {
        return history;
    }

    public void setHistory(HistoryDay[] history) {
        this.history = history;
    }
}
