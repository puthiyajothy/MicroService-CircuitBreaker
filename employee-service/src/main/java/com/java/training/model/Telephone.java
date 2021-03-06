package com.java.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "telephone")
public class Telephone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String number;
	 
	@ManyToOne
    @JoinColumn()
            @JsonIgnore
                Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Telephone(Integer id, String number) {
		super();
		this.id = id;
		this.number = number;
	}

	public Telephone() {
		
	}

	@Override
	public String toString() {
		return "Telephone [id=" + id + ", number=" + number + ", employee=" + employee + "]";
	}
	

}
