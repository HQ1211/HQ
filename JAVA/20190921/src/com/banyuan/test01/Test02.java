package com.banyuan.test01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {

public static void main(String[] args) {
	BufferedReader br = null;
	try {
		br = new BufferedReader(new FileReader("aaa"));
		String line = null;
		char arr[]=new char[3];
		int a=0;
		while ((line = br.readLine()) != null) {
			System.out.println(new String(arr,0,a)+",");
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		if (br != null) {

			try {
				br.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
}