package bo;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import model.AddressBook;
import model.Friend;

public interface AddressBookBO {
	public AddressBook sortAddressBookByFriendName (AddressBook addressBook );

	public HashMap<AddressBook, List<Friend>> getUniqueFriendsFromAddressBook (AddressBook addressBook1 , AddressBook addressBook2) ;
	
	
	
	 
}
