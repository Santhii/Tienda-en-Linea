/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author fabio
 */
public class Comprador {
    public String nombre;
    public String apellido;
    public String usuario;
    public String correro;
    public String numTarjeta;

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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorrero() {
        return correro;
    }

    public void setCorrero(String correro) {
        this.correro = correro;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
    public Comprador(String nombre, String apellido, String usuario, String correo, String numTarjeta ){
        this.nombre=nombre;
        this.apellido=apellido;
        this.usuario=usuario;
        this.correro=correo;
        this.numTarjeta=numTarjeta;
    }
}
