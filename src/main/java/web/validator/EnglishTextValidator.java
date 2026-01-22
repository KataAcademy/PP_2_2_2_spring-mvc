package web.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EnglishTextValidator implements ConstraintValidator<EnglishText, String> {

    private static final String PATTERN = "^[A-Za-z0-9 .\\-]+$";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isBlank()) return true;
        return value.trim().matches(PATTERN);
    }
}
