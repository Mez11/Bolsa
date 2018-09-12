/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casabolsa;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public class Acciones {
    private String simbolo;
    private Double precio;
    private int calidad;

    @Override
    public String toString() {
        return "Acciones{" + "simbolo=" + simbolo + ", precio=" + precio + ", calidad=" + calidad + '}';
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public Acciones(String simbolo, Double precio, int calidad) {
        this.simbolo = simbolo;
        this.precio = precio;
        this.calidad = calidad;
    }
    
}
