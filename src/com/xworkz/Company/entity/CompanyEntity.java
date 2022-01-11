package com.xworkz.Company.entity;
import javax.persistence.*;
@Entity
@Table(name="Company_details")
public class CompanyEntity {
		@Id
		@Column(name="comp_id")
		private int id;
		@Column(name="comp_name")
		private String name;
		@Column(name="comp_type")
		private String type;
		@Column(name="comp_domain")
		private String domain;
		@Column(name="comp_website")
		private String website;
		
		
		public CompanyEntity() {
			
			// TODO Auto-generated constructor stub
		}
		public CompanyEntity(int id, String name, String type, String domain, String website) {
			super();
			this.id = id;
			this.name = name;
			this.type = type;
			this.domain = domain;
			this.website = website;
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
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getDomain() {
			return domain;
		}
		public void setDomain(String domain) {
			this.domain = domain;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}
		@Override
		public String toString() {
			return "CompanyEntity [id=" + id + ", name=" + name + ", type=" + type + ", domain=" + domain + ", website="
					+ website + "]";
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
			CompanyEntity other = (CompanyEntity) obj;
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