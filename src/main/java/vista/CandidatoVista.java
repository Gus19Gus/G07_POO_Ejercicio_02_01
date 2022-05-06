/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.CandidatoControl;
import static java.awt.PageAttributes.MediaType.C;
import modelo.Candidato;
import modelo.Eleccion;

/**
 *
 * @author HP USER
 */
public class CandidatoVista {

    public static void main(String[] args) {

        var candidatoControl = new CandidatoControl();
        candidatoControl.crear("Luis", "0107196156", "Presidente", 2002, "PN69", 3, 1250, 500, 100, "Azuay");
        candidatoControl.crear("Jorge", "0107582648", "Tesorero", 1999, "VAL", 4, 2354, 350, 280, "Carchi");
        candidatoControl.crear("Miguel", "0125638246", "Presidente", 1989, "PSP", 3, 3215, 202, 360, "Cotopaxi");
        System.out.println("Lista de Candidatos");
        for (Candidato candidato : candidatoControl.listar()) {
            System.out.println(candidato.toString());
        }
        candidatoControl.eliminar("0107196156");
        System.out.println("-----------LISTA-----------");
        for (Candidato candidato : candidatoControl.listar()) {
            System.out.println(candidato.toString());
        }
        System.out.println();
        System.out.println("----------MODIFICAR----------");
        var eleccion = new Eleccion(3, 3500, 200, 100, "Carchi");
        var nuevoCandidato = new Candidato("Pablo", "0602594640", "Secretario", 2000, "ALV69");
        
        candidatoControl.modificar("0125638246", nuevoCandidato);
        
        for (Candidato candidato : candidatoControl.listar()){
            System.out.println(candidato.toString());
        }
    }
}
