/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP USER
 */
public class Candidato {
    private String nombre;
    private String cedula;
    private String puestoOcupa;
    private int yearNacimiento;
    private String nombrePartidoPolitico;

    public Candidato(String nombre, String cedula, String puestoOcupa, int yearNacimiento, String nombrePartidoPolitico) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.puestoOcupa = puestoOcupa;
        this.yearNacimiento = yearNacimiento;
        this.nombrePartidoPolitico = nombrePartidoPolitico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPuestoOcupa() {
        return puestoOcupa;
    }

    public void setPuestoOcupa(String puestoOcupa) {
        this.puestoOcupa = puestoOcupa;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }

    public String getNombrePartidoPolitico() {
        return nombrePartidoPolitico;
    }

    public void setNombrePartidoPolitico(String nombrePartidoPolitico) {
        this.nombrePartidoPolitico = nombrePartidoPolitico;
    }

    @Override
    public String toString() {
        return "Candidato{" + "nombre=" + nombre + ", cedula=" + cedula + 
                ", puestoOcupa=" + puestoOcupa + ", yearNacimiento=" +
                yearNacimiento + ", nombrePartidoPolitico=" + nombrePartidoPolitico + '}';
    }
}
