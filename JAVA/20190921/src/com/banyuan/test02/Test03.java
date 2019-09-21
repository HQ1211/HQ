package com.banyuan.test02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		try {
			PrintStream out1=System.out;
			System.setOut(new PrintStream("aaa"));
			System.out.println("hello world===");
			InputStream is = System.in;
			System.setIn(new FileInputStream("aaa"));
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			System.setOut(out1);
			System.out.println(s);
			System.out.println("请输入：");
			sc = new Scanner(is);

			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};

	}

}
