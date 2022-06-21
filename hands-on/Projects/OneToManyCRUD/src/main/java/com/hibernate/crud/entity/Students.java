package com.hibernate.crud.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Students {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sid")
	private int sid;
	@Column(name="sname")
	private String sname;
	@Column(name="cname")
	private String cname;
	@Column(name="email")
	private String email;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	private College college;

	// getters and setters
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}


	
	// Default constructor

	public Students() {
		
	}
	// Parameterized constructor

	public Students(String sname, String email) {
		super();
		this.sname = sname;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", cname=" + cname + ", email=" + email + ", college="
				+ college + "]";
	}


	
	
}
