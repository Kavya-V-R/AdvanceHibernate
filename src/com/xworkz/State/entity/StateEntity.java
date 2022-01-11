package com.xworkz.State.entity;

import javax.persistence.*;

@Entity
@Table(name = "state_details")
public class StateEntity {
	@Id
	@Column(name = "s_id")
	private int id;
	@Column(name = "s_name")
	private String name;
	@Column(name = "s_noOfDist")
	private int noOfDist;
	@Column(name = "s_capitalCity")
	private String CapitaiCity;

	public StateEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StateEntity(int id, String name, int noOfDist, String capitaiCity) {
		super();
		this.id = id;
		this.name = name;
		this.noOfDist = noOfDist;
		CapitaiCity = capitaiCity;
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

	public int getNoOfDist() {
		return noOfDist;
	}

	public void setNoOfDist(int noOfDist) {
		this.noOfDist = noOfDist;
	}

	public String getCapitaiCity() {
		return CapitaiCity;
	}

	public void setCapitaiCity(String capitaiCity) {
		CapitaiCity = capitaiCity;
	}

	@Override
	public String toString() {
		return "StateEntity [id=" + id + ", name=" + name + ", noOfDist=" + noOfDist + ", CapitaiCity=" + CapitaiCity
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CapitaiCity == null) ? 0 : CapitaiCity.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfDist;
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
		StateEntity other = (StateEntity) obj;
		if (CapitaiCity == null) {
			if (other.CapitaiCity != null)
				return false;
		} else if (!CapitaiCity.equals(other.CapitaiCity))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfDist != other.noOfDist)
			return false;
		return true;
	}

}