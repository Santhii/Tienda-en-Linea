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
public class Pelicula {
    private  String nombre;
    private  String genero;
    private double precio; 
    private String sinopsis;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public Pelicula(String nombre, String genero, double precio, String sinopsis){
        this.nombre= nombre;
        this.genero=genero;
        this.precio=precio;
        this.sinopsis=sinopsis;
    }
}
