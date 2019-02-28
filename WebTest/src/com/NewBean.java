package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class NewBean {
	
	public HashMap<String,String> newMap;
	
	public TreeMap<String,String> sortedMap;

	public HashMap getNewMap() {
		return newMap;
	}

	public void setNewMap(HashMap newMap) {
		this.newMap = newMap;
	}

	public TreeMap getSortedMap() {
		sortedMap = new TreeMap<String,String>(newMap);
		
		return sortedMap;
	}

	public void setSortedMap(TreeMap sortedMap) {
		this.sortedMap = sortedMap;
	}
	
	

}
