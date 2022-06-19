package com.noumenalSky.noumenalSky.repositories;

import com.noumenalSky.noumenalSky.models.AstroObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AstroObjectRepository extends JpaRepository<AstroObject, Long> {}
