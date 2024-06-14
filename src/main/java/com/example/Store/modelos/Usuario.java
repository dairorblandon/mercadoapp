package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;

    @Column(name = "nombres",nullable = false, length = 50)
    private String nombres; // no vacio - solo letras y espacios- longitud maxima de 50 caracteres
    @Column(name = "cedula",nullable = false, length = 20)
    private String cedula; // solo numeros sin espacios no vacio-longitud 12
    @Column(name = "correo",nullable = false, length = 100)
    private String correo; // no vacio y formato convencional de correo


    public Usuario(Integer id_usuario, String nombres, String cedula, String correo) {
        this.id_usuario = id_usuario;
        this.nombres = nombres;
        this.cedula = cedula;
        this.correo = correo;
    }

    public Usuario() {
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
