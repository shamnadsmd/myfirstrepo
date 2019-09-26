package com.ust.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.ust.beans.Bill;
import com.ust.beans.Medicine;
import com.ust.beans.Patient;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		
//		Patient pat=factory.getBean( Patient.class);
//		Medicine med =factory.getBean(Medicine.class);
//		Bill bill =factory.getBean(Bill.class);
		
	
		
//		ApplicationContext ctxt=new ClassPathXmlApplicationContext("spring.xml");
		
		
		
		ApplicationContext ctxt=new FileSystemXmlApplicationContext("spring.xml");
		
		
		Patient pat=ctxt.getBean( Patient.class);
		Medicine med =ctxt.getBean(Medicine.class);
		Bill bill =ctxt.getBean(Bill.class);
		
		
		
		
		
		System.out.println(bill);
		System.out.println(med);
		System.out.println(pat);
		
		

	}

}
