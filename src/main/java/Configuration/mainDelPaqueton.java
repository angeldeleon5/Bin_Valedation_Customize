/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuration;

import Configuration.Nombre_Apellido;
import Configuration.validandoConRaulYol;

/**
 *
 * @author angeldeleon
 */
public class mainDelPaqueton {
   
    public static void main (String Args[]){
    
    validandoConRaulYol validando = new validandoConRaulYol();
  
    Nombre_Apellido NombreApellido = new Nombre_Apellido();
    NombreApellido.setNombre("Raul");
    NombreApellido.setApellido("Lencantaelchico");
    NombreApellido.setEmail("raul@lencantaelchico");
    NombreApellido.setTelefono("4444444");


    
    validando.metodovalidador(NombreApellido);
       
    }
}
