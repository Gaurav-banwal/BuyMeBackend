package com.example.buymesomething.repositories;

import com.example.buymesomething.entities.DuesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DuesRepository extends JpaRepository<DuesEntity,Long> {
}
