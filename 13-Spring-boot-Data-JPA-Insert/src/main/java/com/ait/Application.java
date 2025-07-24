package com.ait;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ait.entity.StudentEntity;
import com.ait.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner loadDbRecords(StudentRepository repo) {
		System.out.println("called clr ::::::::: ");
		return args->{
			
		//prepare student entity
			/*
			StudentEntity studentEntity = new StudentEntity();
			//studentEntity.setId(0);//it will set automatically, as mentioned @Id
			studentEntity.setName("Swapna");
			studentEntity.setAddress("Navi Mumbai");
			studentEntity.setContactNo(9812878689l);
			studentEntity.setStream("IT");
			
			//save
			repo.save(studentEntity);
			
			////////////////////////////
			//prepare student entity	
			StudentEntity studentEntity1 = new StudentEntity();
			//studentEntity.setId(0);//it will set automatically, as mentioned @Id
			studentEntity1.setName("Swapna2");
			studentEntity1.setAddress("Navi Mumbai2");
			studentEntity1.setContactNo(9812878689l);
			studentEntity1.setStream("IT2");
			
			//save
			repo.save(studentEntity1);
			*/
			
			for(int i=0; i<50; i++) {
				StudentEntity studentEntity = new StudentEntity();
				//studentEntity.setId(0);//it will set automatically, as mentioned @Id
				studentEntity.setName("Vihaan"+i);
				studentEntity.setAddress("Navi Mumbai" +i);
				studentEntity.setContactNo(9812878689l);
				studentEntity.setStream("IT" +i);
				
				repo.save(studentEntity);
				
			}
			
			//delete by Id
			repo.deleteById(1);
			
			//fetch the record with the student name
			//findByXXX
			Optional<StudentEntity> byName = repo.findByName("Vihaan24");
			if(byName.isPresent())
				System.out.println("name :: "+byName.get().getName());
			
			Optional<StudentEntity> byNameAndID = repo.findByNameAndId("Vihaan31", 32);
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
				
				List<StudentEntity> higherIds = repo.findByIdGreaterThan(31);
				//higherIds.forEach(studentEntity -> System.out.println(studentEntity));
				
				List<StudentEntity> ids = repo.findByIdLessThan(31);
				//ids.forEach(e -> System.out.println(e));

				
		};
	}

}
