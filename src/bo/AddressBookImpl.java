package bo;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import util.FriendComparatorByName;

import model.AddressBook;
import model.Friend;

public class AddressBookImpl implements
AddressBookBO {

	@Override
	public AddressBook sortAddressBookByFriendName(AddressBook addressBook) {
		
		AddressBook addressBook1 = copyAddressBook (addressBook); 
		
		Collections.sort( addressBook1.getFriends(),
						new FriendComparatorByName() );
		
	
		return addressBook1;
	}

	private AddressBook copyAddressBook(AddressBook addressBook) {
		AddressBook addressBook1  = new AddressBook();
		addressBook1.setDescription(addressBook.getDescription());
		addressBook1.setFriends(addressBook.getFriends());
		return addressBook1;
	}


	
	
}
