package com.example.buymesomething.repositories;

import com.example.buymesomething.entities.ItemReceivedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemReceivedRepository extends JpaRepository<ItemReceivedEntity,Long> {
}
