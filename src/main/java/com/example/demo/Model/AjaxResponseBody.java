package com.example.demo.Model;

public class AjaxResponseBody {

    private String message;
    private GoldenCow cow;

    public AjaxResponseBody() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GoldenCow getCow() {
        return cow;
    }

    public void setCow(GoldenCow cow) {
        this.cow = cow;
    }
}
