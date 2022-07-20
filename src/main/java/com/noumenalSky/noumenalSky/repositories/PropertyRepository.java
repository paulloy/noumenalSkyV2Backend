package com.noumenalSky.noumenalSky.repositories;

import com.noumenalSky.noumenalSky.models.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
}
