package com.cdac.prabhat.Schooldb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration gfg = new Configuration();
        gfg.configure("hibernate.cfg.xml");
       
        SessionFactory sf = gfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        
        Teacher e = new Teacher();
        e.setId(1);
        e.setName("prabhatpandey");
        e.setDept("Technical");
        e.setSubject("java");
        e.setSalary(50000);
        
        Teacher e2 = new Teacher();
        e2.setId(2);
        e2.setName("prajwal");
        e2.setDept("civil");
        e2.setSubject("bajri");
        e2.setSalary(50000);
        
        Teacher e3 = new Teacher();
        e3.setId(3);
        e3.setName("mradul");
        e3.setDept("Mechinal");
        e3.setSubject("motor");
        e3.setSalary(50000);
        
        Teacher e4 = new Teacher();
        e4.setId(4);
        e4.setName("puneet");
        e4.setDept("Technical");
        e4.setSubject("Dsa");
        e4.setSalary(50000);
        
        Teacher e5 = new Teacher();
        e5.setId(5);
        e5.setName("aman");
        e5.setDept("Technical");
        e5.setSubject("java");
        e5.setSalary(50000);
        
        System.out.println("data saved");
        
        session.save(e);
        session.save(e2);
        session.save(e3);
        session.save(e4);
        session.save(e5);
        
        t.commit();
        session.close();
        sf.close();
    }
}
