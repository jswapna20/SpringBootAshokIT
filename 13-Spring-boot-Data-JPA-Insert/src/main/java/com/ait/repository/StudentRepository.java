package com.ait.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ait.entity.StudentEntity;

import jakarta.transaction.Transactional;

//mentioning @Repository is optional as it already extends JpaRepository, a spring bean which will be scanned by default
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
	public Optional<StudentEntity> findByName(String name);
	public Optional<StudentEntity> findByNameAndId(String name, Integer id);
	
	@Transactional
	public int deleteByName(String name);
	@Transactional
	public int deleteByStream(String stream);
	
	public java.util.List<StudentEntity> findByIdGreaterThan(int i);
	
	public List<StudentEntity> findByIdLessThan(int i);
}
