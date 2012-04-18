package util;

import java.util.Comparator;

import model.Friend;

public class FriendComparatorByName  implements Comparator<Friend>{

	@Override
	public int compare(Friend frd1, Friend frd2) {
		 return frd1.getName().compareTo(frd2.getName());
	}
	
}
