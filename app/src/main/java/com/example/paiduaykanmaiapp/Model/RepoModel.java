package com.example.paiduaykanmaiapp.Model;

import com.google.gson.annotations.SerializedName;

public class RepoModel {
    @SerializedName("id") String id;
    @SerializedName("name") String name;
    @SerializedName("url") String url;

    public RepoModel(String id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
