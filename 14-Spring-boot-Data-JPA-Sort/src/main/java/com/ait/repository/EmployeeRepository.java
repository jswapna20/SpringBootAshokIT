package com.ait.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ait.entity.EmployeeEntity;

//mentioning @Repository is optional as it already extends JpaRepository, a spring bean which will be scanned by default
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
	
	
	/*
	public Optional<EmployeeEntity> findByName(String name);
	public Optional<EmployeeEntity> findByNameAndId(String name, Integer id);
	
	@Transactional
	public int deleteByName(String name);
	@Transactional
	public int deleteByStream(String stream);
	
	public java.util.List<EmployeeEntity> findByIdGreaterThan(int i);
	
	public List<EmployeeEntity> findByIdLessThan(int i);
	*/
}
