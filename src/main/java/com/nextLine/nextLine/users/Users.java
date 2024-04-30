package com.nextLine.nextLine.users;


import java.util.Date;
import java.util.UUID;

// Model Users
public class Users {
    private UUID user_id;
    private String name;
    private String email;
    private Integer telefono;

    private Date created_at;

    private String identification;
    private  Integer status_id;

    public Users(String name, String email, Integer telefono, String identification, Integer status_id) {
        this.name = name;
        this.email = email;
        this.telefono = telefono;
        this.identification = identification;
        this.status_id = status_id;
    }

    public UUID getUser_id() {
        return user_id;
    }

    public void setUser_id(UUID user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public Integer getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }
}
