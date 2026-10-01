package com.example.buymesomething.dto;


import com.example.buymesomething.annotations.PhoneNoValidation;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    @NotBlank(message = "Name cant be empty")
    private String username;
    @Email(message = "Not a valid Email")
    private String email;


    @NotBlank(message =  "Mobile number cant be blank")
    @PhoneNoValidation
    private String phno;
}
