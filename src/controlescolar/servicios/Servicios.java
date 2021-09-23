/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlescolar.servicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Servicios {
    //Arreglos para guardar la información
    public String[][] asignaturas;
    public int[][] calificaciones;

    public Servicios() {
        asignaturas = new String[1][2];
    }
    
    //Función que me regresa el primer índice vacío que encuentre
    public int indexVacio(String[][] arreglo){
        try{
            for(int fila=0; fila<arreglo.length; fila++){
                if(arreglo[fila][0]==null){
                    return fila;
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al devolver un indice: "+e.getMessage());
        }
        return -1;
    }
    
    //Sobre carga de métodos para redimensionarlos una posición más
    public String[][] redimensionar(String[][] arreglo){
        String nuevoArreglo[][] = new String[arreglo.length+1][arreglo[0].length];
        for (int i = 0; i < arreglo.length; i++) {
            System.arraycopy(arreglo[i], 0, nuevoArreglo[i], 0, arreglo[i].length);
        }        
    return nuevoArreglo;
    }
    
    public int[][] redimensionar(int[][] arreglo){
        int nuevoArreglo[][] = new int[arreglo.length+1][arreglo[0].length];
        for (int i = 0; i < arreglo.length; i++) {
            System.arraycopy(arreglo[i], 0, nuevoArreglo[i], 0, arreglo[i].length);
        }        
    return nuevoArreglo;
    }
    
}
