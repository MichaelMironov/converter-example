package org.example.annotation;

import org.example.converter.TextConverter;
import org.junit.jupiter.params.converter.ConvertWith;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.METHOD})
@ConvertWith(TextConverter.class)
public @interface Report {

    int length() default 0;
}
