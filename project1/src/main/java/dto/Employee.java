package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
	private int empid;
private String eName;
private String dob;
private String gender;
private String country;

	public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

	public void setcountry(String country) {
		this.country=country;
}

public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}


public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}

}
