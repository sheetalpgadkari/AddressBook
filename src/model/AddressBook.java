package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AddressBook {
	private String description;
	private List<Friend> friends = new ArrayList<Friend>();
	
	public String getDescription() {
		return description;
	}
	public List<Friend> getFriends() {
		return friends;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}
	
	public List<Friend> compareAndGetUniqueFrds (AddressBook adr2){
		List<Friend> uniqueFrds = new ArrayList<Friend>() ;
		
		for ( Friend frd1 : getFriends ()){
			boolean uniQueFrd = true;
			for ( Friend frd2 : adr2.getFriends()){
				if (frd1.getName().equalsIgnoreCase(frd2.getName())){
					uniQueFrd = false;
				}
			}
			if (uniQueFrd){
				uniqueFrds.add(frd1);
			}
		}
		return uniqueFrds;
	}
}
