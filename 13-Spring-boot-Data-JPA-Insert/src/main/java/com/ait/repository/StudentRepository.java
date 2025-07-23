package com.ait.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ait.entity.StudentEntity;

//mentioning @Repository is optional as it already extends JpaRepository, a spring bean which will be scanned by default
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
