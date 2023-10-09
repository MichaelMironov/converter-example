package org.example.converter;

import org.apache.commons.lang3.RandomStringUtils;
import org.example.annotation.Report;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

import java.util.Optional;

public class TextConverter implements ArgumentConverter {
    @Override
    public Object convert(final Object source, final ParameterContext parameterContext) throws ArgumentConversionException {

        if (!(source instanceof String)) throw new ArgumentConversionException("Strings required");

        System.out.println("Values source: " + source);

        final Optional<Report> annotation = parameterContext.findAnnotation(Report.class);

        if (annotation.isPresent()) {
            return RandomStringUtils.randomAlphabetic(annotation.get().length());
        }

        throw new ArgumentConversionException("Convert failed");
    }
}
