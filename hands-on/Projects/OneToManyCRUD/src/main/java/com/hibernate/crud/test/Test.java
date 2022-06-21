package com.hibernate.crud.test;

import org.hibernate.Session;

import com.hibernate.crud.dao.CollegeDao;
import com.hibernate.crud.dao.StudentDao;
import com.hibernate.crud.entity.College;
import com.hibernate.crud.entity.Students;
import com.hibernate.crud.util.HibernateUtil;

public class Test {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        
        // Create an college
        
        College coll1 = new College("MCC","Mumbai");
        College coll = new College("PVG","Mumbai");
      
       
        // Create student
        Students std = new Students();
        std.setSname("Mayur");
        std.setCname("PVG");
        std.setEmail("mayur@gmail.com");
        // Create project2
        Students std1 = new Students();
        std1.setSname("Sakshi");
        std1.setCname("PVG");
        std1.setEmail("sakshi@gmail.com");
        // employee can work on two projects, Add project references in the employee
        coll.getStds().add(std1);
        coll.getStds().add(std);
       
       // Add employee reference in the projects
         coll.getStds().add(std);
         coll.getStds().add(std1);

         session.save(std);
         session.save(std1);

       session.save(coll);
       session.save(coll1);
       session.getTransaction().commit();
       HibernateUtil.shutdown();
       
       CollegeDao colle = new CollegeDao();
       colle.deleteCollege(1);
       
       StudentDao stdo = new StudentDao();
       stdo.deleteStudents(2);
       
    }
}