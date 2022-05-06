/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Eleccion;

/**
 *
 * @author HP USER
 */
public interface IEleccionServicio {
    
    public Eleccion crear(Eleccion eleccion);
    public List<Eleccion> listar ();
    public Eleccion modificar (String cedula, Eleccion eleccion);
    public Eleccion eliminar (String cedula);
    public int buscarposicion (String cedula);
}
