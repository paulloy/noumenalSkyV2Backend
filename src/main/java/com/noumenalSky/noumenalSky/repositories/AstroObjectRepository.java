package com.noumenalSky.noumenalSky.repositories;

import com.noumenalSky.noumenalSky.models.AstroObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AstroObjectRepository extends JpaRepository<AstroObject, Long> {
    List<AstroObject> findByType(String type);
}
