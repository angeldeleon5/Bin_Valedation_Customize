/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuration;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author angeldeleon
 */


public class Nombre_Apellido {
    
 @NotNull(message=" No es un nombre valido valido ")
    @Size(min = 1, max= 5, message= "Debe de ser un nombre válido")
    @NotEmpty (message = "Debe de completar el nombre")
    @reviewDatabase
         String Nombre;
    
    @NotNull(message=" No es un apellido valido  ")
    @Size(min = 1, max= 5, message= "Debe de ser un apellido válido")
    @NotEmpty (message = "Debe de completar el apellido")    
    String Apellido;
    
    @Email (message = "No es un Email valido")
    String Email;
   
    @Size (min = 6, max= 10, message= "Debe de ser un Telefono válido")
    String telefono;    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    

    
    
}
