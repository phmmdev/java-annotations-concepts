package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class AnnotationProcessor
{
    public void processMethodsAnnotated()
    {
        Class _class = CustomAnnotationUsage.class;
        Method[] declaredMethods = _class.getDeclaredMethods();

        for(Method method : declaredMethods)
        {
            System.out.println("method - " + method.getName());
            Annotation[] _annotations = method.getAnnotations();
            for (Annotation annotation: _annotations)
            {
                CustomAnnotation customAnnotation = (CustomAnnotation) annotation;
                System.out.println(customAnnotation.message() + " - " + customAnnotation.cost());
            }
        }
    }

    public void processConstructorsAnnotated()
    {
        Class _class = CustomAnnotationUsage.class;
        Constructor[] declaredMethods = _class.getConstructors();

        for(Constructor constructor : declaredMethods)
        {
            System.out.println("constructor - " + constructor.getName());
            Annotation[] _annotations = constructor.getAnnotations();
            for (Annotation annotation: _annotations)
            {
                CustomAnnotation customAnnotation = (CustomAnnotation) annotation;
                System.out.println(customAnnotation.message() + " - " + customAnnotation.cost());
            }
        }
    }

    public void processFieldsAnnotated()
    {
        Class _class = CustomAnnotationUsage.class;
        Field[] declaredMethods = _class.getFields();

        for(Field field : declaredMethods)
        {
            System.out.println("constructor - " + field.getName());
            Annotation[] _annotations = field.getAnnotations();
            for (Annotation annotation: _annotations)
            {
                CustomAnnotation customAnnotation = (CustomAnnotation) annotation;
                System.out.println(customAnnotation.message() + " - " + customAnnotation.cost());
            }
        }
    }

}
