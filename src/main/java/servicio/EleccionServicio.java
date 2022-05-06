/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Eleccion;

/**
 *
 * @author HP USER
 */
public class EleccionServicio implements IEleccionServicio{
    private final List<Eleccion> eleccionList=new ArrayList<> ();

    @Override
    public Eleccion crear(Eleccion eleccion) {
        this.eleccionList.add(eleccion);
        return eleccion;
    }

    @Override
    public List<Eleccion> listar() {
        return this.eleccionList;
    }

    @Override
    public Eleccion modificar(String lugarEleccion, Eleccion eleccion) {
        this.eleccionList.set(this.buscarposicion(lugarEleccion), eleccion);
        return eleccion;
    }

    @Override
    public Eleccion eliminar(String lugarEleccion) {
        var eleccion = this.eleccionList.get(this.buscarposicion(lugarEleccion));
        this.eleccionList.remove(this.buscarposicion(lugarEleccion));
        return eleccion;
       }

    @Override
    public int buscarposicion(String lugarEleccion) {
        var posicion = -1;
        var i=0;
        for (var auxEleccion: this.eleccionList){
            if (auxEleccion.getLugarEleccion()==lugarEleccion){
                posicion = i;
                break;
            }
            i++;
            
        }
        return posicion;
    }
}
