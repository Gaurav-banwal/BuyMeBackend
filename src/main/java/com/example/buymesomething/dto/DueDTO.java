package com.example.buymesomething.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class DueDTO {
    @NotNull
     @Positive
    Long loaner;
    @NotNull
    @Positive
    Long recipient;
    @NotNull
    Long amount;
}
