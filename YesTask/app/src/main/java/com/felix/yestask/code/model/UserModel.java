package com.felix.yestask.code.model;

public class UserModel {

    private final String mName;
    private final String mCity;
    private final String mDescription;
    private int mAge;
    private boolean check;

    public UserModel(String name, String city, String description, int age, boolean check) {
        this.mName = name;
        this.mCity = city;
        this.mDescription = description;
        this.mAge = age;
        this.check = check;
    }

    public int getmAge() {
        return mAge;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public String getName() {
        return mName;
    }

    public String getCity() {
        return mCity;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getAge() {
        return mAge;
    }

    public void incrementAge() {
        mAge++;
    }

    public String getmCity() {
        return mCity;
    }

    public boolean isCheck() {
        return check;
    }
}