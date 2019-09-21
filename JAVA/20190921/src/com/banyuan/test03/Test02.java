package com.banyuan.test03;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Test02 {

	public static void main(String[] args) {
		Properties p=new Properties();
		p.setProperty("user", "zhangsan");
		p.setProperty("password", "123456");
		try {
			
			p.load(new FileReader("b.txt"));
			System.out.println(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
