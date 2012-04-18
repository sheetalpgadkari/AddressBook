package bo;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import model.AddressBook;
import model.Friend;

import org.junit.Before;
import org.junit.Test;

public class AddressBookBOTest {
	
	AddressBookBO addressBookBO ;

	private AddressBook getUniversityFriendsAddressBook1(){
		AddressBook addressBook1 = new AddressBook();
		addressBook1.setDescription("UniversityFriends");
		
		List<Friend> frds = new ArrayList<Friend>();
		
		Friend frd1 = new Friend("John", "982908842");
		frds.add(frd1);
		
		
		Friend frd2 = new Friend("Mathew", "987272938");
		frds.add(frd2);

		Friend frd3 = new Friend("Shen", "98725663938");
		frds.add(frd3);
		
		
		Friend frd4 = new Friend("Jerry", "98725638");
		frds.add(frd4);
		
		
		addressBook1.setFriends(frds);
		
		return addressBook1;
	}
	
	private AddressBook getWorkFriendsAddressBook1(){
		AddressBook addressBook1 = new AddressBook();
		addressBook1.setDescription("WorkFriends");
		
		List<Friend> frds = new ArrayList<Friend>();
		
		Friend frd1 = new Friend("Justin", "98927408");
		frds.add(frd1);
		
		Friend frd2 = new Friend("Mathew", "987272938");
		frds.add(frd2);
		
		addressBook1.setFriends(frds);
		
		return addressBook1;
	}
	
	@Before
	public void setUp() throws Exception {
		addressBookBO = new AddressBookImpl();
		
	}
	
	@Test
	public void testSortAddressBookByFriendNameWithNamesStartingWithSameLetter (){
		AddressBook addressBook = getUniversityFriendsAddressBook1();
		AddressBook sortedAddressBook = addressBookBO.sortAddressBookByFriendName(addressBook);
		 
		List<Friend >  frds = sortedAddressBook.getFriends();
		assertEquals ("Jerry" ,frds.get(0).getName() );
		assertEquals ( "John", frds.get(1).getName());
		assertEquals ("Mathew" , frds.get(2).getName() );
		assertEquals ( "Shen", frds.get(3).getName());
			
	}
	
	@Test
	public void testSortAddressBookByFriendNameWithFrdWithSameName (){
		AddressBook addressBook = getUniversityFriendsAddressBook1();
		Friend newfrd = new Friend("Mathew", "987272938");
		addressBook.getFriends().add(newfrd);

		AddressBook sortedAddressBook = addressBookBO.sortAddressBookByFriendName(addressBook);
		 
		List<Friend >  frds = sortedAddressBook.getFriends();
		assertEquals ("Jerry" ,frds.get(0).getName() );
		assertEquals ( "John", frds.get(1).getName());
		assertEquals ("Mathew" , frds.get(2).getName() );
		assertEquals ("Mathew" , frds.get(3).getName() );
		assertEquals ( "Shen", frds.get(4).getName());		
	}

}
