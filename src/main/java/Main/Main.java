package Main;

import annotations.AnnotationProcessor;
import annotations.AsusPhone;
import annotations.SmartPhone;

import java.lang.annotation.Annotation;

public class Main
{
    public static void main(String[] args)
    {
        /*AnnotationProcessor annotationProcessor = new AnnotationProcessor();
        annotationProcessor.processMethodsAnnotated();
        annotationProcessor.processConstructorsAnnotated();
        annotationProcessor.processFieldsAnnotated();*/

        AsusPhone asusPhone =  new AsusPhone();
        Class _class = asusPhone.getClass();
        Annotation annotation = _class.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone = (SmartPhone) annotation;
        System.out.println(smartPhone.os());
        System.out.println(smartPhone.version());
    }
}
