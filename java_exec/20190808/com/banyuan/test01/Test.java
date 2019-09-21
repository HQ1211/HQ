package com.banyuan.test01;
import com.banyuan.test01.Person;
public class Test{
	public static void main(String[] args){
		Person2 p=new Person2(0);
		Person2 p2=new Person2();
		int a=10;
	}
}
class Person2{
	public Person2(int a){
		System.out.println("Person2(int a)的构造函数");
	}
	public Person2(){
		System.out.println("Person2()的构造方法");
	}
     
}