package com.be.apptwo.common.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.be.apptwo.common.model.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {

}
