package com.bilgeadam.example;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloJSF {

    private String tanim="Merhaba, Ben JSF Nesnesi İle oluşturuldum.";
    private String name;
    private String surname;
    private String userName;
    private String password;

    public void onKaydet(){

        System.out.println("Name: "+name+" Surname: "+surname+" Username: "+userName
        +" Password: "+password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTanim() {
        return tanim;
    }

    public void setTanim(String tanim) {
        this.tanim = tanim;
    }
}
