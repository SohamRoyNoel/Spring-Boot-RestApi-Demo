package com.hateoas.HateoasDemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;



@Entity
@Table(name="Designation")
public class Designation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String Designation;
	private float Salary;

	public Designation() {

	}

	public Designation(String designation, float salary) {
		Designation = designation;
		Salary = salary;
	}



	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

	//	@Override
	//	public String toString() {
	//		return "Designation [Designation=" + Designation + ", Salary=" + Salary + ", employee=" + employee + "]";
	//	}
}
