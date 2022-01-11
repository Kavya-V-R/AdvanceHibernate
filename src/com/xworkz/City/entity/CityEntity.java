package com.xworkz.City.entity;

import javax.persistence.*;

@Entity
@Table(name = "city_details")
public class CityEntity {
	@Id
	@Column(name = "c_id")
	private int id;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_population")
	private double population;
	@Column(name = "c_famousfor")
	private String famousfor;
	@Column(name = "c_coronazone")
	private String coronazone;

	public CityEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CityEntity(int id, String name, double population, String famousfor, String coronazone) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
		this.famousfor = famousfor;
		this.coronazone = coronazone;

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

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	public String getFamousfor() {
		return famousfor;
	}

	public void setFamousfor(String famousfor) {
		this.famousfor = famousfor;
	}

	public String getCoronazone() {
		return coronazone;
	}

	public void setCoronazone(String coronazone) {
		this.coronazone = coronazone;
	}

	@Override
	public String toString() {
		return "CityEntity [id=" + id + ", name=" + name + ", population=" + population + ", famousfor=" + famousfor
				+ ", coronazone=" + coronazone + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coronazone == null) ? 0 : coronazone.hashCode());
		result = prime * result + ((famousfor == null) ? 0 : famousfor.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(population);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		CityEntity other = (CityEntity) obj;
		if (coronazone == null) {
			if (other.coronazone != null)
				return false;
		} else if (!coronazone.equals(other.coronazone))
			return false;
		if (famousfor == null) {
			if (other.famousfor != null)
				return false;
		} else if (!famousfor.equals(other.famousfor))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(population) != Double.doubleToLongBits(other.population))
			return false;
		return true;
	}

}
