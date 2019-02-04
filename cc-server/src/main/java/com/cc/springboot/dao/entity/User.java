package com.cc.springboot.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "user")
public class User extends CommonEntity {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;

	@Column(name = "corp_email")
	private String corpEmail;

	@Column(name = "personal_email")
	private String personalEmail;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "company_location")
	private String companyLocation;

	@Column(name = "corp_email_validated")
	private Boolean corpEmailValidated;

	@Column(name = "personal_email_validated")
	private Boolean personalEmailValidated;

	@Column(name="active")
	private Boolean active;
	
	public Long getId() {
		return id;
	}

	public void setUserId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCorpEmail() {
		return corpEmail;
	}

	public void setCorpEmail(String corpEmail) {
		this.corpEmail = corpEmail;
	}

	public String getPersonalEmail() {
		return personalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyLocation() {
		return companyLocation;
	}

	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}

	public Boolean getCorpEmailValidated() {
		return corpEmailValidated;
	}

	public void setCorpEmailValidated(Boolean corpEmailValidated) {
		this.corpEmailValidated = corpEmailValidated;
	}

	public Boolean getPersonalEmailValidated() {
		return personalEmailValidated;
	}

	public void setPersonalEmailValidated(Boolean personalEmailValidated) {
		this.personalEmailValidated = personalEmailValidated;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("firstName", firstName)
				.append("lastName", lastName).append("corpEmail", corpEmail).append("personalEmail", personalEmail)
				.append("companyName", companyName).append("companyLocation", companyLocation)
				.append("corpEmailValidated", corpEmailValidated)
				.append("personalEmailValidated", personalEmailValidated).toString();
	}

}
