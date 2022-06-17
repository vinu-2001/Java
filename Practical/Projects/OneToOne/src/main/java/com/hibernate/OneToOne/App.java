package com.hibernate.OneToOne;

import java.util.List;

import com.hibernate.OneToOne.dao.InstructorDao;
import com.hibernate.OneToOne.entity.Instructor;
import com.hibernate.OneToOne.entity.InstructorDetail;

public class App 
{
    public static void main( String[] args )
    {
    	// Save two instructors
        Instructor instructor = new Instructor("Ramesh", "Fadatare", "ramesh@javaguides.com");
        InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com", "Guitar");
        instructorDetail.setInstructor(instructor);
        instructor.setInstructorDetail(instructorDetail);
       
        Instructor instructor1 = new Instructor("Ram", "Fadatare", "ramesh@javaguides.com");
        InstructorDetail instructorDetail1 = new InstructorDetail("http://www.youtube.com", "Guitar");
        instructorDetail1.setInstructor(instructor1);
        instructor1.setInstructorDetail(instructorDetail1);
       
        InstructorDao instructorDao = new InstructorDao();
        instructorDao.saveInstructor(instructor);
        instructorDao.saveInstructor(instructor1);
        instructorDao.getInstructor(1);
       
        // Get all instructors
        List<Instructor> instructors = instructorDao.getAllInstructor();
        instructors.forEach(instructorTemp -> System.out.println(instructorTemp.getFirstName()));
    }
}
