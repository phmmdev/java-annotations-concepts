package annotations;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SmartPhone
{
    String os() default  "Android";
    String version() default "1.0.0";
}
