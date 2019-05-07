package java.core.bt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook implements Phone {
	ArrayList<NguoiDung> phoneList=new ArrayList<>();
	@Override
	public void insertPhone(String name, String phone) {
		NguoiDung nguoidung=new NguoiDung();
		boolean timThay=false;
		for (NguoiDung x : phoneList) {
			if(nguoidung.getName().equalsIgnoreCase(name)){
				if(nguoidung.getPhone().contains(phone)){
					nguoidung.setPhone(":"+phone);
					timThay=true;
					break;
				}
			}
			if (timThay==false) {
				nguoidung.setName(name);
				nguoidung.setPhone(phone);
				phoneList.add(nguoidung);
				timThay=true;
			}
		}
	}

	@Override
	public void removePhone(String name) {
		for (NguoiDung x : phoneList) {
			if(x.getName().equals(name)){
				phoneList.remove(x);
			}
		}
		
	}

	@Override
	public void updatePhone(String name, String newPhone) {
		for (NguoiDung x : phoneList) {
			if(x.getPhone().equals(name)){
				x.setPhone(newPhone);
			}
		}
		
	}

	@Override
	public void searchPhone(String name) {
		for (NguoiDung x : phoneList) {
			if(x.getName().equals(name)){
				System.out.println("name:" + x.getName() + "phone" + x.getPhone());
			}
		}
		
	}

	@Override
	public void sortPhone() {
		Collections.sort(phoneList, new Comparator<NguoiDung>(
				) {

					@Override
					public int compare(NguoiDung ng1, NguoiDung ng2) {
						return (ng1.getName().compareTo(ng2.getName()));
					}
		});
		
	}

}
