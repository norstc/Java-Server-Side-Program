/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.ambleinfo.service;

import com.norstc.ambleinfo.util.SessionUtils;
import com.norstc.ambleinfo.dao.LoginDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author zhangjh
 */
@Named(value = "login")
@SessionScoped
public class LoginBean implements Serializable {

    private String pwd;
    private String msg;
    private String user;

    /**
     * Creates a new instance of Login
     */
    public LoginBean() {
    }
    
    
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    //validate login
    public String validateUsernamePassword(){
        boolean valid = LoginDAO.validate(user,pwd);
        if(valid){
            HttpSession session = SessionUtils.getSession();
            session.setAttribute("username",user);
            return "admin";
        }else{
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_WARN,"Incrroct Username and Password","please retry"));
            return "login";
        }
       
    }
    public String logout(){
        HttpSession session = SessionUtils.getSession();
        session.invalidate();
        return "login";
    }
    
    public String toIndex(){
        return "index";
    }
    
}
