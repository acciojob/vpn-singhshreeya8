package com.driver.model;



import jdk.internal.module.ServicesCatalog;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Admin {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String username;

    private String password;

    @OneToMany(mappedBy = "admin",cascade = CascadeType.ALL)
    List<ServicesCatalog.ServiceProvider> serviceProviders = new ArrayList<>();

    public Admin() {
    }

    public Admin(int id, String username, String password, List<ServicesCatalog.ServiceProvider> serviceProviders) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.serviceProviders = serviceProviders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public List<ServicesCatalog.ServiceProvider> getServiceProviders() {
        return serviceProviders;
    }

    public void setServiceProviders(List<ServicesCatalog.ServiceProvider> serviceProviders) {
        this.serviceProviders = serviceProviders;
    }
}

