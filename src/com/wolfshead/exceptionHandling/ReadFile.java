package com.wolfshead.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("D:\\testout.txt");
			int i;
			while ((i = fr.read()) != -1)
				System.out.println((char) i);
			fr.close();
		} catch (FileNotFoundException fileNotFound) {
			System.out.println("this is FNF exception;");
		} catch (IOException io) {
			System.out.println("this is IO exception");
		} catch (Exception ex) {
			System.out.println("This is parent exception");
		} finally {
			System.out.println("Finally block");
		}

	}

}
