package Configuration;



import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = reviewDatabaseValidator.class)
@Documented
public @interface reviewDatabase {
    String message () default " Error de  validacion de datos ";
    Class <?> [] groups() default {};
    Class <? extends Payload>[] payload() default {};
    
    
}
