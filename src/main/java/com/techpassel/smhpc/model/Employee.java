package com.techpassel.smhpc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="employee")
public class Employee {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
	
	@NotNull
	private String name;
	
	@NotNull
	@Size(min = 5, max = 25)
	@Column(unique = true)
	private String email;
	
	@Size(min = 10, max = 15)
	private String phone;
	
	@Size(min = 25)
	private String password;
	
	@Column(name = "is_active")
	private boolean isActive;

	public Employee() {
		super();
	}

	public Employee(@NotNull String name, @NotNull @Size(min = 5, max = 25) String email,
			@Size(min = 10, max = 15) String phone, @Size(min = 25) String password, boolean isActive) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.isActive = isActive;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password="
				+ password + ", isActive=" + isActive + "]";
	}
}
