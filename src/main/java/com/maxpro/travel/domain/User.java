package com.maxpro.travel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;

	@Column(name = "USER_NAME" )
	private String username;
	
	@Column(name = "EMAIL" )
	private String Email;
	
	@Column(name = "COMPANY_NAME" )
	private String CompanyName;
	
	@Column(name = "WEBSITE_URL" )
	private String WebsiteUrl;
	
	@Column(name = "PASSWORD" )
	private String Password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getWebsiteUrl() {
		return WebsiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		WebsiteUrl = websiteUrl;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
