package com.example.prasanth.simplemvplist.model;

/**
 * Created by Prasanth on 11/22/2016.
 */

public class GithubUser {
    private int id;
    private String url;
    private String login;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "GithubUser{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
