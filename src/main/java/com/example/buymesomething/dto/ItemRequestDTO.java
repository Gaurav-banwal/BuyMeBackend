package com.example.buymesomething.dto;


import com.example.buymesomething.annotations.PhoneNoValidation;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemRequestDTO  {



    @NotNull
    @Positive
    Long senderId;
    @NotNull
    String senderUsername;
    @PhoneNoValidation
    String senderPhno;
    @NotBlank
    String Item;
    @NotNull
     @Positive
            @Max(value = 2000, message = "You cant buy this much ")
    Long cost;
    @NotNull
     @Positive
    Long quantity;
    @NotNull
    Boolean accepted;


    LocalDateTime createdAt;
    @FutureOrPresent
    LocalDateTime expireAt;

}
