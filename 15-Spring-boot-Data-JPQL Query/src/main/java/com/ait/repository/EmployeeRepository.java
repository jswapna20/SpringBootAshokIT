package com.ait.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ait.entity.EmployeeEntityData;

//mentioning @Repository is optional as it already extends JpaRepository, a spring bean which will be scanned by default
public interface EmployeeRepository extends JpaRepository<EmployeeEntityData, Integer> {
	
	@Query("SELECT e FROM EmployeeEntityData e")
	List<EmployeeEntityData>getAllEmployee();
	
	
	@Query("SELECT e FROM EmployeeEntityData e WHERE e.salary = :salary")
	//EmployeeEntityData getEmployee(@Param("salary1") int salary7);//if @Param gvn, :salary should match Param naming
	EmployeeEntityData getEmployee(int salary);//it works .....w/o @Param annotation too// here :salary naming should match salary parameter naming

	
	@Query("SELECT e FROM EmployeeEntityData e WHERE e.dept = :dept AND e.salary = :salary")
	List<EmployeeEntityData> getEmployeesUsing(@Param("dept") String dept, @Param("salary") int salary);
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
