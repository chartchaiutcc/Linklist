package Linklist;

public class StudentRecord {
	private long id;
	private String name;
	private String phone;
	private String email;
	StudentRecord next;
	
	public StudentRecord (long id,String name, String phone, String email) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public long getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString () {
		return "{" + this.id + "," + this.name + "," + this.phone + "," 
				+ this.email + "}";
	}
}
