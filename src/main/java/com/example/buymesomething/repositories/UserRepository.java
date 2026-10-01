package com.example.buymesomething.repositories;

import com.example.buymesomething.entities.UserProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserProfileEntity,Long> {
}
