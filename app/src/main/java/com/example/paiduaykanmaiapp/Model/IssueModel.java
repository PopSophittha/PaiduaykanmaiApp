package com.example.paiduaykanmaiapp.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class IssueModel {

    @SerializedName("id") String id;
    @SerializedName("node_id") String node_id;
    @SerializedName("number") String number;
    @SerializedName("title") String title;
    @SerializedName("state") String state;
    @SerializedName("locked") String locked;

}
