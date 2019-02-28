package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class AlphaBean {

	private static final String UNCHECKED = "unchecked";

	public HashMap<String,String> linkedMap;
	
	public LinkedHashMap<String,String> arrangedMap;
	
	public HashMap<String, String> getLinkedMap() {
		
		
		return linkedMap;
	}

	public void setLinkedMap(HashMap<String, String> linkedMap) {
		this.linkedMap = linkedMap;
	}

	public LinkedHashMap<?, ?> getArrangedMap() {
		return sort(linkedMap);
	}

	@SuppressWarnings(UNCHECKED)
	public LinkedHashMap<String, String> sort(HashMap<String, String> m) {
		System.out.println("ggggg");
		System.out.println(m.entrySet());
		System.out.println(m.keySet());
		
		
		Set<Entry<String, String>> s = m.entrySet();
		List<Entry<String,String>> l = new ArrayList<Entry<String, String>>(s);
		Collections.sort(l, new Comparator<Entry<String,String>>() {

			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}

			
		});
		arrangedMap = new LinkedHashMap<>();
		 for(Entry<String,String> e : l) {
			 arrangedMap.put(e.getKey(), e.getValue());
		 }
		return arrangedMap;
	}

	
	
	
}
