package com.yyy.xxx.semestralnezadananie;

import java.util.Date;

public class User {

    String username;
    String date;
    Integer numberOfPosts;

    public User() {
    }

    public User(String username, String date, Integer numberOfPosts) {

        this.username = username;
        this.date = date;
        this.numberOfPosts = numberOfPosts;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getNumberOfPosts() {
        return numberOfPosts;
    }

    public void setNumberOfPosts(Integer numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

}
