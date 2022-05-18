/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

import java.time.LocalDate;

/**
 *
 * @author user
 */
public class Register {
    private Integer id_regis;
    private String nombre;
    private String apellido;
    private String correo;
    private LocalDate fnacimiento;
    private String user;
    private String contraseña;

    public Register(Integer id_regis, String nombre, String apellido, String correo, LocalDate fnacimiento, String user, String contraseña) {
        this.id_regis = id_regis;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fnacimiento = fnacimiento;
        this.user = user;
        this.contraseña = contraseña;
    }

    public Integer getId_regis() {
        return id_regis;
    }

    public void setId_regis(Integer id_regis) {
        this.id_regis = id_regis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(LocalDate fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    

}
