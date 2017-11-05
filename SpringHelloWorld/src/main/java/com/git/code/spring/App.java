package com.git.code.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.git.code.beans.Mundo;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/git/spring/xml/beans.xml");
		Mundo m = (Mundo) applicationContext.getBean("mundo");
		System.out.println(m.getSaludo());
	}

}
