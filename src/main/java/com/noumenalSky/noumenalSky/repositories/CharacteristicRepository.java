package com.noumenalSky.noumenalSky.repositories;

import com.noumenalSky.noumenalSky.models.Characteristic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacteristicRepository extends JpaRepository<Characteristic, Long> {}
