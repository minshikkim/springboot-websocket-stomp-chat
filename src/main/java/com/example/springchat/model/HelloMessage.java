package com.example.springchat.model;


public class HelloMessage {
    private String userid;
    private String message;

    public HelloMessage() {
    }

    public HelloMessage(String userid, String message) {
        this.userid = userid;
        this.message = message;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloMessage{" +
                "userid='" + userid + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
