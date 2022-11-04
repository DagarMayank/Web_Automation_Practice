package org.Testing.testCases;

public class PojoClassBasicOuterInformation
{
	private String firstname;
	private String lastname;
	private String designation;
	private PojoClassInnerInforamtion team;
	private String[] family;
	
	
	
	public String[] getFamily() {
		return family;
	}
	public void setFamily(String[] family) {
		this.family = family;
	}
	public PojoClassInnerInforamtion getTeam() {
		return team;
	}
	public void setTeam(PojoClassInnerInforamtion team) {
		this.team = team;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
