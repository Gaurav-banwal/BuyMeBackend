package com.example.buymesomething.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DuesTable")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DuesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long loaner;
    Long recipient;
    Long amount;
}
