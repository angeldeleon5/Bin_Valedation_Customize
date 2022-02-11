package Configuration;


import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angeldeleon
 */
public class validandoConRaulYol {
      public void metodovalidador (Object nuevoContacto){
    
       ValidatorFactory factory = javax.validation.Validation.buildDefaultValidatorFactory();
        
        Validator validator = factory.getValidator();
       
        Set<ConstraintViolation<Object>> violations = validator.validate(nuevoContacto);
        
        for (ConstraintViolation<Object> violation : violations){
            System.out.println(violation.getMessage());
        }
    }

    
}
