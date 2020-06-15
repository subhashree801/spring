package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println(factory);
		Student student = (Student) factory.getBean("studentbean");
		Student student1 = (Student) factory.getBean("employeebean");

		student.displayInfo();
		student1.displayInfo();
	}
}
