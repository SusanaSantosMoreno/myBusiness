package com.springlessons.mybusiness.entities;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "SECRETARIO", schema = "COMPANY")
public class Secretario implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "DNI", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String dni;
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;
    @Column(name = "APELLIDOS", nullable = false)
    private String apellidos;
    @Column(name = "DIRECCION", nullable = false)
    private String direccion;
    @Column(name = "ANNIOS_ANTIGUEDAD", nullable = false)
    private int anniosAntiguedad;
    @Column(name = "TELEFONO", nullable = false)
    private String telefono;
    @Column(name = "SALARIO", nullable = false)
    private double salario;
    @Column(name = "DESPACHO", nullable = false)
    private String despacho;
    @Column(name = "TELEFONO_EMPRESA", nullable = false)
    private String telefonoEmpresa;

    public Secretario() {
        super();
    }

    public Secretario(String dni, String nombre, String apellidos, String direccion, int anniosAntiguedad,
            String telefono, double salario, String despacho, String telefonoEmpresa) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.anniosAntiguedad = anniosAntiguedad;
        this.telefono = telefono;
        this.salario = salario;
        this.despacho = despacho;
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAnniosAntiguedad() {
        return anniosAntiguedad;
    }

    public void setAnniosAntiguedad(int anniosAntiguedad) {
        this.anniosAntiguedad = anniosAntiguedad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }
}