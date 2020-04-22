package com.syntax.class26;

import java.util.LinkedList;

public class Repl {
public static void main(String[] args) {
	LinkedList<Integer>number=new LinkedList<>();
	for(int i=number.size();i<50; i++) {
		if(i%3!=0) {
			System.out.print(i+" ");
		}
	}
}
}
