package com.paqp.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author pc
 */
@ManagedBean
@SessionScoped
public class LoginController {
    private String username;
    private String password;
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String logar() {
        if (this.username.equals("felipe") && this.password.equals("123456")) {
            return "/atendimento?faces-redirect=true";
        } else if (this.username.equals("ernanny") && this.password.equals("123456")) {
            return "/solicitacao?faces-redirect=true";
        } else {
            return null;
        }
    }


    
}
