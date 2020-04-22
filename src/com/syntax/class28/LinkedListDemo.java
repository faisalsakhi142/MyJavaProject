package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> llist=new LinkedList<>();
		llist.add("Yunus");
		llist.add(0, "Reyhan");
		llist.add("Pavel");
		llist.add("Farid");
		llist.add("Farid");
		llist.add("Farid");
		int size=llist.size();
		System.err.println(size);
		
		for(String name:llist) {
			System.out.println(name);
		}
		for(int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		Iterator<String> name=llist.iterator();
while(name.hasNext()) {
	String list=name.next();
	System.out.println(list);
	}
	}
}
