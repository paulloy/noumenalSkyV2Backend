package com.noumenalSky.noumenalSky.repositories;

import com.noumenalSky.noumenalSky.models.DataReference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataReferenceRepository extends JpaRepository<DataReference, Long> {
}
