package model;

import java.util.Collection;
import java.util.List;

public class AddressBook {
	private String description;
	private List<Friend> friends;
	
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
	
	
}
