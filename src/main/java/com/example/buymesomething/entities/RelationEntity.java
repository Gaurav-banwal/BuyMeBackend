package com.example.buymesomething.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Relations")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RelationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long relationId;
    Long sender;
    Long receiver;
    LocalDateTime dateofRequest;
    Boolean accepted;



}
