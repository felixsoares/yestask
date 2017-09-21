package com.felix.yestask.code.model;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by user on 21/09/2017.
 */

public class RMActivity extends RealmObject {

    @PrimaryKey
    private int id;
    private String title;
    private String description;
    private String clock;
    private RMCategory category;
    private Date date;
    private Date dateDone;
    private boolean creatAlarm;
    private boolean done;
    private int priority;

    public RMActivity(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public RMCategory getCategory() {
        return category;
    }

    public void setCategory(RMCategory category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateDone() {
        return dateDone;
    }

    public void setDateDone(Date dateDone) {
        this.dateDone = dateDone;
    }

    public boolean isCreatAlarm() {
        return creatAlarm;
    }

    public void setCreatAlarm(boolean creatAlarm) {
        this.creatAlarm = creatAlarm;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
