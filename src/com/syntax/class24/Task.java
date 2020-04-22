package com.syntax.class24;

public abstract class Task {
//	Create a class File that will have the following behaviors: open, edit, close. Edit and close are
//	implemented method while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PDFFile that will
//	provide specific implementation of open behaviour: Example: to open .java file we need notepad++ or sublime
//	text, to open .doc file we need Microsoft word to be installed etc


public void edit() {
	
}
public void close() {
	
}
public abstract void open();
}

class JavaFile extends Task{

	@Override
	public void open() {
		System.out.println("To open Java file we need notepad");
		
	}
	
}
class WordFile extends Task{

	@Override
	public void open() {
		System.out.println("To open Word file we need Microsoft word");
		
	}
	
}
class PDFFile extends Task{

	@Override
	public void open() {
		System.out.println("To open PDF File we need Adobe Acrobat Reader");
		
	}
	
}
