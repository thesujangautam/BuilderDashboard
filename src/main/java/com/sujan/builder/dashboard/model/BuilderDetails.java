package com.sujan.builder.dashboard.model;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="builder")
public class BuilderDetails {

	private String builderId;
	private String builderName;
	private String company;
	private String term;
	private String email;
	private String companyAddress;
	private String phoneNumber;
	private boolean isActive;
	
	
	public BuilderDetails(String builderId, String builderName, String company, String term, String email,
			String companyAddress, String phoneNumber, boolean isActive) {
		super();
		this.builderId = builderId;
		this.builderName = builderName;
		this.company = company;
		this.term = term;
		this.email = email;
		this.companyAddress = companyAddress;
		this.phoneNumber = phoneNumber;
		this.isActive = isActive;
	}
	public String getBuilderId() {
		return builderId;
	}
	public void setBuilderId(String builderId) {
		this.builderId = builderId;
	}
	public String getBuilderName() {
		return builderName;
	}
	public void setBuilderName(String builderName) {
		this.builderName = builderName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	
}
