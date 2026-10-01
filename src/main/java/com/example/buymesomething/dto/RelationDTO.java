package com.example.buymesomething.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class RelationDTO {

    @NotNull
    @Positive
    private Long receiver;
    @NotNull
    private Boolean accepted;
}
