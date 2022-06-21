package com.hibernate.crud.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="college")
public class College {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cid")
	private int cid;
	@Column(name="cname")
	private String cname;
	@Column(name="city")
	private String city;
	
	@OneToMany( cascade = {CascadeType.ALL})
	@JoinColumn(name="student_id")
	Set < Students > stds = new HashSet < Students > ();
	
	public Set<Students> getStds() {
		return stds;
	}
	public void setStds(Set<Students> stds) {
		this.stds = stds;
	}
	// getters and setters
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	// Default constructor
	public College() {
		super();
	}

	// Parameterized constructor
	public College(String cname, String city) {
		super();
		this.cname = cname;
		this.city = city;
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", city=" + city + ", stds=" + stds + "]";
	}
	

	
}
