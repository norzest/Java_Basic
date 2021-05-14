package java_20210514;

import java.util.ArrayList;

public class MemberManager {
	private ArrayList<Member> list;
	
	// constructor
	public MemberManager() {
		list = new ArrayList<>();
	}
	
	
	// function
	public void insert(String id, String name, int age) {
		list.add(new Member(id, name, age));
	} // insert
	
	public void update(String variable, String value, String nValue) {
		
		if (variable == "id") {
			for (int i = 0; i < list.size(); i++) {
				if(value.equals(list.get(i).getId())) {
					Member temp = list.get(i);
					list.set(i, new Member(nValue, temp.getName(), temp.getAge()));
					break;
				}
			}
		} else if (variable == "name") {
			for (int i = 0; i < list.size(); i++) {
				if(value.equals(list.get(i).getName())) {
					Member temp = list.get(i);
					list.set(i, new Member(temp.getId(), nValue, temp.getAge()));
					break;
				}
			}
		} else if (variable == "age") {
			for (int i = 0; i < list.size(); i++) {
				if(Integer.parseInt(value) == list.get(i).getAge()) {
					Member temp = list.get(i);
					list.set(i, new Member(temp.getId(), temp.getName(), Integer.parseInt(nValue)));
					break;
				}
			}
		}
	} // update

	public void delete(String id) {
		for (int i = 0; i < list.size(); i++) {
			if(id.equals(list.get(i).getId())) {
				list.remove(i);
				break;
			}
		}
	} // delete
	
	public ArrayList<Member> select() {
		return list;
	} // select all

	public Member select(String variable, String value) {
		Member temp = new Member();
		if (variable == "id") {
			for (int i = 0; i < list.size(); i++) {
				if(value.equals(list.get(i).getId())) {
					temp = list.get(i);
					break;
				}
			}
		} else if (variable == "name") {
			for (int i = 0; i < list.size(); i++) {
				if(value.equals(list.get(i).getName())) {
					temp = list.get(i);
					break;
				}
			}
		} else if (variable == "age") {
			for (int i = 0; i < list.size(); i++) {
				if(Integer.parseInt(value) == list.get(i).getAge()) {
					temp = list.get(i);
					break;
				}
			}
		}
		return temp;
	} // select

} // member manager
