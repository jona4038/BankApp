package com.example.demo.Model;

import javax.validation.constraints.NotEmpty;

public class SearchCriteria {

    @NotEmpty(message = "Username can't be empty")
    private String username;

    public SearchCriteria() {
    }

    public SearchCriteria(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
