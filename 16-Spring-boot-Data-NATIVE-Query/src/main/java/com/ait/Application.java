package com.ait;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ait.entity.EmployeeEntityData;
import com.ait.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner loadDbRecords(EmployeeRepository repo) {
		System.out.println("called clr ::::::::: ");
		return args->{
			
			List<String> list = new ArrayList<>();
			list.add("Raja");
			list.add("Rani");
			list.add("Yogesh");
			list.add("Akshay");
			list.add("Vihaan");
			int salary = 9999;

			
			for(int i=0; i<5; i++) {
				EmployeeEntityData studentEntity = new EmployeeEntityData();
				//studentEntity.setId(0);//it will set automatically, as mentioned @Id
				studentEntity.setName(list.get(i));
				studentEntity.setAddress("Navi Mumbai");
				studentEntity.setContactNo(9812878689l);
				studentEntity.setDept("IT");
				studentEntity.setSalary(salary);				
				repo.save(studentEntity);
				salary++;
					
			}
			
			
			//fetching using Native Query
			List<EmployeeEntityData>allEmployee = repo.getAllEmployee();
			System.out.println("Using Native Query:: Showing all the employess ==" +allEmployee);
			allEmployee.forEach(allEmployees -> System.out.println("###Using JPQL :: Showing all the employess ==" +allEmployees));
			
			
			//fetching using Native Query
			EmployeeEntityData employee = repo.getEmployee(10002);
			System.out.println("Using Native Query for salary:: employee with particular salary==" +employee);
			
			
			//fetching using Native Query 
			List<EmployeeEntityData> allEmployeeUsingDeptAndSalary = repo.getEmployeesUsing("IT", 10000);
			System.out.println("Using JPQL ::allEmployeeUsingDeptAndSalary==" +allEmployeeUsingDeptAndSalary);
             			
			
			/*
			List<EmployeeEntityData> allEmployees = repo.findAll();
			allEmployees.forEach(employee -> System.out.println(employee));
			
			//By default, natural sorting
			List<EmployeeEntityData> all = repo.findAll(Sort.by("salary"));
			all.forEach(data -> System.out.println("Natural sorting==" +data));
			
			//customized salary :: DESC order salary
			//List<EmployeeEntity> all1 = repo.findAll(Sort.by(Sort.Direction.DESC, "salary"));
			List<EmployeeEntityData> all1 = repo.findAll(Sort.by(Sort.Direction.DESC, "name"));
			all1.forEach(data -> System.out.println("DESC order salary==" +data));
            */
			
			
			
			
				
		};
	}

}
