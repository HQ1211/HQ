package com.banyuan.test01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test01 {

public static void main(String[] args) {
	BufferedWriter bw = null;
	try {
		bw = new BufferedWriter(new FileWriter("aaa"));
		bw.write("中国人abc123");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		if (bw != null) {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
}
