package com.example.paiduaykanmaiapp.Model;

import com.google.gson.annotations.SerializedName;

public class PayloadModel {

    @SerializedName("action") String action;
    @SerializedName("issue") IssueModel issue;
    @SerializedName("comment") CommentModel comment;

    public PayloadModel(String action, IssueModel issue, CommentModel comment) {
        this.action = action;
        this.issue = issue;
        this.comment = comment;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public IssueModel getIssue() {
        return issue;
    }

    public void setIssue(IssueModel issue) {
        this.issue = issue;
    }

    public CommentModel getComment() {
        return comment;
    }

    public void setComment(CommentModel comment) {
        this.comment = comment;
    }
}
