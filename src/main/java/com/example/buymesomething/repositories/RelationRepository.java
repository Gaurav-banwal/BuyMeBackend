package com.example.buymesomething.repositories;

import com.example.buymesomething.entities.RelationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelationRepository  extends JpaRepository<RelationEntity,Long> {
}
