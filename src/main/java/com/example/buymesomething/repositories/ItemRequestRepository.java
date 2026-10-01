package com.example.buymesomething.repositories;

import com.example.buymesomething.entities.ItemRequestsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRequestRepository extends JpaRepository<ItemRequestsEntity,Long> {
}
