/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Candidato;
import modelo.Eleccion;
import servicio.CandidatoServicio;

/**
 *
 * @author HP USER
 */
public class CandidatoControl {
    
    
    public CandidatoServicio candidatoservicio = new CandidatoServicio();
    public Candidato crear (String nombre, String cedula, String puestoOcupa, int yearNacimiento, String nombrePartidoPolitico, int numeroCandidatos, int votosValidos, int votosNulos, int votosBlanco, String lugarEleccion){
        var eleccion = new Eleccion(numeroCandidatos, votosValidos, votosNulos, votosBlanco, lugarEleccion);
        var candidato = new Candidato(nombre, cedula, puestoOcupa, yearNacimiento, nombrePartidoPolitico);
        this.candidatoservicio.crear(candidato);
        return candidato;
    }
    public Candidato eliminar(String cedula){
        return this.candidatoservicio.eliminar(cedula);
    }
    public Candidato modificar(String cedula, Candidato candidatoN){
        return this.candidatoservicio.modificar(cedula, candidatoN);
    }
    public List<Candidato> listar(){
        return this.candidatoservicio.listar();
    }
}
