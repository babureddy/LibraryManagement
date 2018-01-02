package com.utilities.library;

import java.util.HashMap;
import java.util.Map;

public class LibraryManagement {

	@Override
	public String toString() {
		String s ="";
		for(int key:libraryUserMap.keySet()) {
			s += key + " " + libraryUserMap.get(key);
		}
		
		return "LibraryManagement [libraryUserMap=" + s + "]";
	}

	private Map<Integer, Integer> libraryUserMap = new HashMap<Integer, Integer>();
	
	public void userBook(int libId, int userId) {
		libraryUserMap.put(libId,userId);
	}
	
	public boolean isBookAvailable(int libId) {
		return libraryUserMap.containsKey(libId);
	}

	public void release(int bookId) {
		libraryUserMap.remove(bookId);
	}
}
