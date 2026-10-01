package com.example.buymesomething.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "ItemRequest")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemRequestsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long senderId;
    String senderUsername;
    String senderPhno;
    String Item;
    Long cost;
    Long quantity;
    Boolean accepted;
    LocalDateTime createdAt;
    LocalDateTime expireAt;

}
