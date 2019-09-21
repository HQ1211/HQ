package com.banyuan.test03;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test01 {

	public static void main(String[] args) {
		Properties p=new Properties();
		p.setProperty("user", "zhangsan");
		p.setProperty("password", "123456");
		try {
			p.store(new FileWriter("b.txt"), "");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
