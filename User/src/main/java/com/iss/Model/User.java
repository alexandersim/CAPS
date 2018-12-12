package com.iss.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@Column(name = "UserID")
	private String userID;
	@Column(name = "UserTpe")
	private String userType;
	@Column(name = "Password")
	private String password;
	@Column(name = "LastName")
	private String lastName;
	@Column(name = "FirstMidName")
	private String firstMidName;
	@Column(name = "Phone")
	private int phone;
	@Column(name = "Email")
	private String email;
	@Column(name = "Address")
	private String address;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userID, String userType, String password, String lastName, String firstMidName, int phone,
			String email, String address) {
		super();
		this.userID = userID;
		this.userType = userType;
		this.password = password;
		this.lastName = lastName;
		this.firstMidName = firstMidName;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstMidName() {
		return firstMidName;
	}
	public void setFirstMidName(String firstMidName) {
		this.firstMidName = firstMidName;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstMidName == null) ? 0 : firstMidName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + phone;
		result = prime * result + ((userID == null) ? 0 : userID.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
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
		User other = (User) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstMidName == null) {
			if (other.firstMidName != null)
				return false;
		} else if (!firstMidName.equals(other.firstMidName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone != other.phone)
			return false;
		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		return true;
	}

}
