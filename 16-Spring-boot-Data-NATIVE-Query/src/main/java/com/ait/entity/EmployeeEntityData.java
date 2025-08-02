package com.ait.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
//@Setter
//@Getter
//@NoArgsConstructor
//@ToString
@Data
@Table(name="employee")
public class EmployeeEntityData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "empid", nullable=false, length=100)
	private int id;
	private String name;
	private String dept;
	@Column(name="mobile", updatable=false)//cannot change the field value after inserting the value
	private Long contactNo;
	private int salary;
	private String address;
	//@CreatedDate //inserts date when the record is created(but we have to insert record manually...chk )/inserted //@CreatedBy same function
	@CreationTimestamp
	@Column(insertable=false)//no one can change the record once created
	private Date recordCreated;
	
	


}
