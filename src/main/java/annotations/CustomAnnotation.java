package annotations;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface CustomAnnotation
{
    String message() default "this is default message";
    int cost();
}
