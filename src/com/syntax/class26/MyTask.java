package com.syntax.class26;

import java.util.ArrayList;

public class MyTask {

public static void main(String[] args) {

	ArrayList<String> type=new ArrayList<>();
	type.add("hi");
	type.add("yo");
	type.add("sup");
	type.add("yolo");
	type.add("boop");
	type.remove(0);
	type.remove(1);
	type.remove(2);
	for(String type1:type) {
		System.out.println(type1);
	}

}
}