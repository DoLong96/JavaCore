package java.core.bt1;

public class NguoiDung {
	private String name;
	private String phone;

	public NguoiDung() {
		super();
	}


	public NguoiDung(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
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


	void viewInfor() {
		System.out.println("Name:" + name);
		System.out.println("Phone:" + phone);
	}
}
