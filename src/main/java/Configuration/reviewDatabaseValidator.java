
/**
 *
 * @author angeldeleon
 */

import Configuration.reviewDatabase;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class reviewDatabaseValidator implements ConstraintValidator <reviewDatabase ,String> {
   @Override
    public boolean isValid(String value, ConstraintValidatorContext cvc) {
        //Se hace la vaidacion una base de datos, codigo, si existe, etc
        
        if (value.equals("Rauloyochico")){return true;}else{return false;}
    }
}
