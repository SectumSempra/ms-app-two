package com.be.apptwo.common.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.be.apptwo.common.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
