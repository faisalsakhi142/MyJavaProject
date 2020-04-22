package com.syntax.class24;

public class TaskTest{
	public static void main(String[] args) {
		Task JavaFile= new JavaFile();
		JavaFile.open();
		Task WordFile= new WordFile();
		WordFile.open();
		Task PDFFile= new PDFFile();
		PDFFile.open();
	}
}
