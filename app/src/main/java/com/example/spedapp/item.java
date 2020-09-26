package com.example.spedapp;

public class item {

    int background;
    String profileName;

    public item(int background, String profileName) {
        this.background = background;
        this.profileName = profileName;
    }

    public int getBackground() {
        return background;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }
}
