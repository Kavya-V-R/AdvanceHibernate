package com.xworkz.Patient.entity;

import javax.persistence.*;

@Entity
@Table(name="Patient_details")
public class PatientEntity {
	@Id
	@Column(name="patient_id")
	private int id;
	@Column(name="patient_name")
	private String name;
	@Column(name="patient_age")
	private int age;
	@Column(name="patient_birthPlace")
	private String birthPlace;
	@Column(name="patient_corona")
	private String corona;
	
	public PatientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientEntity(int id, String name, int age, String birthPlace, String corona) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.birthPlace = birthPlace;
		this.corona = corona;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getCorona() {
		return corona;
	}
	public void setCorona(String corona) {
		this.corona = corona;
	}
	@Override
	public String toString() {
		return "PatientEntity [id=" + id + ", name=" + name + ", age=" + age + ", birthPlace=" + birthPlace
				+ ", corona=" + corona + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatientEntity other = (PatientEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}