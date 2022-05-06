/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP USER
 */
public class Eleccion {
    
    private int numeroCandidatos;
    private int votosValidos;
    private int votosNulos;
    private int votosBlanco;
    private String lugarEleccion;
    private Candidato unCandidato;

    public Eleccion(int numeroCandidatos, int votosValidos, int votosNulos, int votosBlanco, String lugarEleccion) {
        this.numeroCandidatos = numeroCandidatos;
        this.votosValidos = votosValidos;
        this.votosNulos = votosNulos;
        this.votosBlanco = votosBlanco;
        this.lugarEleccion = lugarEleccion;
    }

    public int getNumeroCandidatos() {
        return numeroCandidatos;
    }

    public void setNumeroCandidatos(int numeroCandidatos) {
        this.numeroCandidatos = numeroCandidatos;
    }

    public int getVotosValidos() {
        return votosValidos;
    }

    public void setVotosValidos(int votosValidos) {
        this.votosValidos = votosValidos;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }

    public int getVotosBlanco() {
        return votosBlanco;
    }

    public void setVotosBlanco(int votosBlanco) {
        this.votosBlanco = votosBlanco;
    }

    public String getLugarEleccion() {
        return lugarEleccion;
    }

    public void setLugarEleccion(String lugarEleccion) {
        this.lugarEleccion = lugarEleccion;
    }

    @Override
    public String toString() {
        return "Eleccion{" + "numeroCandidatos=" + numeroCandidatos + 
                ", votosValidos=" + votosValidos + ", votosNulos=" +
                votosNulos + ", votosBlanco=" + votosBlanco + ", lugarEleccion=" +
                lugarEleccion + ", unCandidato=" + unCandidato + '}';
    }
    
}
