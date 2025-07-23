package com.ait;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ait.entity.StudentEntity;
import com.ait.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	public CommandLineRunner loadDbRecords(StudentRepository repo) {
		System.out.println("called clr ::::::::: ");
		return args->{
		//prepare student entity	
			StudentEntity studentEntity = new StudentEntity();
			//studentEntity.setId(0);//it will set automatically, as mentioned @Id
			studentEntity.setName("Swapna");
			studentEntity.setAddress("Mumbai");
			studentEntity.setContactNo(98128786L);
			studentEntity.setStream("IT");
			
			//save
			repo.save(studentEntity);
		};
	}

}
