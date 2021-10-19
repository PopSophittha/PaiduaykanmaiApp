package com.example.paiduaykanmaiapp.Model;

import com.google.gson.annotations.SerializedName;

public class EventModel {

    @SerializedName("id") String id;
    @SerializedName("type") String type;
    @SerializedName("actor") ActorModel actor;
    @SerializedName("repo") RepoModel repo;
    @SerializedName("payload") PayloadModel payload;
    @SerializedName("public") Boolean isPublic;
    @SerializedName("created_at") String created_at;
    @SerializedName("org") OrgModel org;

    public EventModel(String id, String type, ActorModel actor, RepoModel repo, PayloadModel payload, Boolean isPublic, String created_at, OrgModel org) {
        this.id = id;
        this.type = type;
        this.actor = actor;
        this.repo = repo;
        this.payload = payload;
        this.isPublic = isPublic;
        this.created_at = created_at;
        this.org = org;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ActorModel getActor() {
        return actor;
    }

    public void setActor(ActorModel actor) {
        this.actor = actor;
    }

    public RepoModel getRepo() {
        return repo;
    }

    public void setRepo(RepoModel repo) {
        this.repo = repo;
    }

    public PayloadModel getPayload() {
        return payload;
    }

    public void setPayload(PayloadModel payload) {
        this.payload = payload;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public OrgModel getOrg() {
        return org;
    }

    public void setOrg(OrgModel org) {
        this.org = org;
    }
}
