package com.example.buymesomething.dto;

import jakarta.validation.constraints.*;

import java.time.LocalDateTime;

public class ItemReceivedDTO {


     @NotNull
     @Positive
    Long requestid;
     @NotNull
     @Positive
    Long senderId;

     @NotBlank
    String Item;
     @NotNull
          @Positive
          @Max(value = 2000)
    Long cost;
     @Positive
      @Max(value = 20)
    Long quantity;
     @NotBlank
     @Positive
    Long acceptedBy;

     @PastOrPresent
    LocalDateTime createdAt;

    LocalDateTime expireAt;
    Boolean fallback;
}
