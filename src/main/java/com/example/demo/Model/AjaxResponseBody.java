package com.example.demo.Model;

import java.util.List;

public class AjaxResponseBody {

    private String message;
    private GoldenCow cow;
    private List<GoldenCow> result;

    public AjaxResponseBody() {

    }
    public List<GoldenCow> getResult() {
        return result;
    }

    public void setResult(List<GoldenCow> result) {
        this.result = result;
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
