package com.vti.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Position" , catalog = "Project1_Account_Management")
public class Position implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "PositionID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "PositionName", nullable = false, unique = true)
	@Enumerated(EnumType.STRING)
	private PositionName name;
	
	public enum PositionName {
		Dev , Test , Scrum_Master , PM
	}
	
	@OneToMany(mappedBy = "position")
	private List<Account> accounts ;

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public PositionName getName() {
		return name;
	}

	public void setName(PositionName name) {
		this.name = name;
	}

	public List<Account> getAccount() {
		return accounts;
	}

	public void setAccount(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	
}
