    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
public class EstadisticaModelo {
    
    //Método que oculta una etiqueta
    public void ocultar(JLabel label, int tiempo){
        ActionListener tarea = (ActionEvent evt) -> {
            label.setText("");
        };
     Timer timer = new Timer(tiempo, tarea);
     timer.setRepeats(false);
     timer.start();
    }
    
    //Función que regresa un modelo dependiendo de la opción que haya seleccionado el usuario
    public DefaultTableModel calificacion(JLabel etiqueta, String opcion){
        DefaultTableModel modelo =null;
        
        try{
            String titulos []= {"Clave","Asignatura",opcion};
            modelo = new DefaultTableModel(null, titulos){
            @Override
            public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
        };
            
            if(opcion.equalsIgnoreCase("Calificacion mas baja")){
                
                for(int fila=0; fila<VentanaPrincipal.servicio.asignaturas.length; fila++){
                if(VentanaPrincipal.servicio.asignaturas[fila][0]!=null){
                    String objeto [] = new String[3];
                    int calificacionMenor;
                    objeto[0] = VentanaPrincipal.servicio.asignaturas[fila][0];
                    objeto[1] = VentanaPrincipal.servicio.asignaturas[fila][1];
                    
                    calificacionMenor = VentanaPrincipal.servicio.calificaciones[fila][0];
                    for(int columna=0; columna<VentanaPrincipal.servicio.calificaciones[fila].length; columna++){
                        if(VentanaPrincipal.servicio.calificaciones[fila][columna]<calificacionMenor){
                            calificacionMenor = VentanaPrincipal.servicio.calificaciones[fila][columna];
                        }
                    }
                    objeto[2] = Integer.toString(calificacionMenor);
                    modelo.addRow(objeto);
                }
                
                }
            }else if(opcion.equalsIgnoreCase("Calificacion mas alta")){
                for(int fila=0; fila<VentanaPrincipal.servicio.asignaturas.length; fila++){
                if(VentanaPrincipal.servicio.asignaturas[fila][0]!=null){
                    int calificacionMayor;
                    String objeto [] = new String[3];
                    objeto[0] = VentanaPrincipal.servicio.asignaturas[fila][0];
                    objeto[1] = VentanaPrincipal.servicio.asignaturas[fila][1];
                    calificacionMayor = VentanaPrincipal.servicio.calificaciones[fila][0];
                    for(int columna=0; columna<VentanaPrincipal.servicio.calificaciones[fila].length; columna++){
                        if(VentanaPrincipal.servicio.calificaciones[fila][columna]>calificacionMayor){
                            calificacionMayor = VentanaPrincipal.servicio.calificaciones[fila][columna];
                        }
                    }
                    objeto[2] = String.valueOf(calificacionMayor);
                    modelo.addRow(objeto);
                }
                }
            }else if(opcion.equalsIgnoreCase("Promedio")){
                
                for(int fila=0; fila<VentanaPrincipal.servicio.asignaturas.length; fila++){
                if(VentanaPrincipal.servicio.asignaturas[fila][0]!=null){
                    String objeto [] = new String[3];
                    objeto[0] = VentanaPrincipal.servicio.asignaturas[fila][0];
                    objeto[1] = VentanaPrincipal.servicio.asignaturas[fila][1];
                    float sumador=0;
                    for(int columna=0; columna<VentanaPrincipal.servicio.calificaciones[fila].length; columna++){
                        sumador= sumador+VentanaPrincipal.servicio.calificaciones[fila][columna];
                    }
                    float promedio = sumador/VentanaPrincipal.servicio.calificaciones[fila].length;
                    objeto[2] = String.valueOf(promedio);
                     modelo.addRow(objeto);
                }
                }
            }
            
            //Si todo sale correcto, manda una etiqueta
            etiqueta.setForeground(new Color(0,153,0));
            etiqueta.setText("¡Todo salió bien! :)");
            this.ocultar(etiqueta, 1000);
        }catch(Exception e){
            etiqueta.setForeground(Color.red);
            etiqueta.setText("Error :(");
            this.ocultar(etiqueta, 1000);
        }
        
        return modelo;        
    }
}
