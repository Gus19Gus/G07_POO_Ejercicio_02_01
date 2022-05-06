/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Candidato;

/**
 *
 * @author HP USER
 */
public interface ICandidatoServicio {
    
    public Candidato crear(Candidato candidato);
    public List<Candidato> listar ();
    public Candidato modificar (String cedula, Candidato candidato);
    public Candidato eliminar (String cedula);
    public int buscarposicion (String cedula);
}
