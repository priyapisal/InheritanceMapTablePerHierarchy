package com.scp.hiberate.InheritanceMap;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
   
public class StoreData {  
public static void main(String[] args) {  
	
	SessionFactory sfact=new Configuration().configure().buildSessionFactory();
	Session session=sfact.openSession();
	
//AnnotationConfiguration cfg=new AnnotationConfiguration();  
//Session session=cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();  
      
    Transaction t=session.beginTransaction();  
      
    Employee e1=new Employee();  
    e1.setName("sonoo");  
    e1.setId(100); 
    
    Regular_Employee e2=new Regular_Employee();  
    e2.setName("Vivek Kumar");  
    e2.setSalary(50000);  
    e2.setBonus(5);  

    
    Contract_Employee e3=new Contract_Employee();  
    e3.setName("Arjun Kumar");  
    e3.setPay_per_hour(1000);  
    e3.setContract_duration("15 hours");  
  
    session.save(e1);  
    session.save(e2);  
    session.save(e3);  
      
    t.commit();  
    session.close();  
    System.out.println("success");  
}  
}  