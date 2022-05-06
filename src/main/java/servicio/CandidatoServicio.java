/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Candidato;

/**
 *
 * @author HP USER
 */
public class CandidatoServicio implements ICandidatoServicio {
    
    private final List<Candidato> candidatoList=new ArrayList<> ();

    @Override
    public Candidato crear(Candidato candidato) {
        this.candidatoList.add(candidato);
        return candidato;
    }

    @Override
    public List<Candidato> listar() {
        return this.candidatoList;
    }

    @Override
    public Candidato modificar(String cedula, Candidato candidato) {
        this.candidatoList.set(this.buscarposicion(cedula), candidato);
        return candidato;
    }

    @Override
    public Candidato eliminar(String cedula) {
        var candidato = this.candidatoList.get(this.buscarposicion(cedula));
        this.candidatoList.remove(this.buscarposicion(cedula));
        return candidato;
    }

    @Override
    public int buscarposicion(String cedula) {
        var posicion = -1;
        var i=0;
        for (var auxCandidato: this.candidatoList){
            if (auxCandidato.getCedula()== cedula){
                posicion = i;
                break;
            }
            i++;
            
        }
        return posicion;
    }
}
