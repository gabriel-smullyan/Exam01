package main;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String email;
    private boolean isFrozen;


    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.isFrozen = false;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void Freeze() {
        this.isFrozen = true;
    }

    public void UnFreeze() {
        this.isFrozen = false;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public boolean getIsFrozen() {
        return this.isFrozen;
    }

    public String toString() {
        return "Username: " + this.username + " Email: " + this.email;
    }



    
}
