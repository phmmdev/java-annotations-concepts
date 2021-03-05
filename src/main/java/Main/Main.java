package Main;

import annotations.AnnotationProcessor;

public class Main
{
    public static void main(String[] args)
    {
        AnnotationProcessor annotationProcessor = new AnnotationProcessor();
        annotationProcessor.processMethodsAnnotated();
        annotationProcessor.processConstructorsAnnotated();
        annotationProcessor.processFieldsAnnotated();
    }
}
