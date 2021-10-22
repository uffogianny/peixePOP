/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peixepop;

import java.util.ArrayList;

/**
 *
 * @author Developer
 */
public class Sala {
    
    private String codigo;
    private String nombre;
    private Planta planta;
    private ArrayList<Piscina> piscinas;

    public Sala(String codigo, String nombre, Planta planta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.piscinas = new ArrayList<Piscina>();
        this.planta = planta;
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Piscina> getPiscinas() {
        return piscinas;
    }

    public void setPiscinas(ArrayList<Piscina> piscinas) {
        this.piscinas = piscinas;
    }
    
    public void anadirPiscinas(){
        
    }
}
