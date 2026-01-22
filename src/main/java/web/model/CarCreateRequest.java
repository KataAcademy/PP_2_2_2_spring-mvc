package web.model;

import lombok.Data;
import web.validator.EnglishText;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CarCreateRequest {

    @NotBlank(message = "Brand is required.")
    @EnglishText(message = "Brand must contain only English characters.")
    private String brand;

    @NotBlank(message = "Model is required.")
    @EnglishText(message = "Model must contain only English characters.")
    private String model;

    @NotNull(message = "Year is required.")
    @Min(value = 1900, message = "Year must be 1900 or later.")
    @Max(value = 2026, message = "Year must be 2026 or earlier.")
    private Integer year;
}
