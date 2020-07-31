package model.entities;

import java.io.Serializable;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String email;
	private String passEmail;
	private String passWord;
	
	private Department department;
	
	public User() {
		
	}

	public User(Integer id, String name, String email, String passEmail, String passWord, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.passEmail = passEmail;
		this.passWord = passWord;
		this.department = department;
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

	public String getPassEmail() {
		return passEmail;
	}

	public void setPassEmail(String passEmail) {
		this.passEmail = passEmail;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [Id=");
		builder.append(id);
		builder.append(", Name=");
		builder.append(name);
		builder.append(", Email=");
		builder.append(email);
		builder.append(", PassEmail=");
		builder.append(passEmail);
		builder.append(", PassWord=");
		builder.append(passWord);
		builder.append(", department=");
		builder.append(department);
		builder.append("]");
		return builder.toString();
	}
}
