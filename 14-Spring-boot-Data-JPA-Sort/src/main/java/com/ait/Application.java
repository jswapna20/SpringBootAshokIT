package com.ait;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Sort;

import com.ait.entity.EmployeeEntity;
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
				EmployeeEntity studentEntity = new EmployeeEntity();
				//studentEntity.setId(0);//it will set automatically, as mentioned @Id
				studentEntity.setName(list.get(i));
				studentEntity.setAddress("Navi Mumbai");
				studentEntity.setContactNo(9812878689l);
				studentEntity.setDept("IT");
				studentEntity.setSalary(salary);				
				repo.save(studentEntity);
				salary++;
				
				
			}
			
			List<EmployeeEntity> allEmployees = repo.findAll();
			allEmployees.forEach(employee -> System.out.println(employee));
			
			//By default, natural sorting
			List<EmployeeEntity> all = repo.findAll(Sort.by("salary"));
			all.forEach(data -> System.out.println("Natural sorting==" +data));
			
			//customized salary :: DESC order salary
			//List<EmployeeEntity> all1 = repo.findAll(Sort.by(Sort.Direction.DESC, "salary"));
			List<EmployeeEntity> all1 = repo.findAll(Sort.by(Sort.Direction.DESC, "name"));
			all1.forEach(data -> System.out.println("DESC order salary==" +data));

			
			
			/*
			//delete by Id
			repo.deleteById(1);
			
			//fetch the record with the student name
			//findByXXX
			Optional<EmployeeEntity> byName = repo.findByName("Vihaan24");
			if(byName.isPresent())
				System.out.println("name :: "+byName.get().getName());
			
			Optional<EmployeeEntity> byNameAndID = repo.findByNameAndId("Vihaan31", 32);
			if(byNameAndID.isPresent())
				System.out.println(byNameAndID.get());
			
			
			//create custom method to below operations
			//greater than
			//less than
			//deletebyname
			//deletebystream
			
			
				int deletedEntityId = repo.deleteByName("Vihaan30");
				int deletedEntityid1 = repo.deleteByStream("IT24");
				System.out.println("deletedEntityI=" +deletedEntityId +"deletedEntityId1=" +deletedEntityid1) ;
				
				List<EmployeeEntity> higherIds = repo.findByIdGreaterThan(31);
				//higherIds.forEach(studentEntity -> System.out.println(studentEntity));
				
				List<EmployeeEntity> ids = repo.findByIdLessThan(31);
				//ids.forEach(e -> System.out.println(e));
				*/
				
		};
	}

}
