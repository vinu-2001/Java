package com.hibernate.crud.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.crud.entity.College;
import com.hibernate.crud.entity.Students;
import com.hibernate.crud.util.HibernateUtil;

public class CollegeDao {

	 public void saveCollege(College coll) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.save(coll);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	 

	    /**
	     * Update Instructor
	     * @param instructor
	     */
	    public void updateCollege(College coll) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.update(coll);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	 

	    /**
	     * Delete Instructor
	     * @param id
	     */
	    public void deleteCollege(int id) {

	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();

	 

	            // Delete a instructor object
	            College coll = session.get(College.class, id);
	            if (coll != null) {
	                session.delete(coll);
	                System.out.println("College is deleted");
	            }

	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	 

	    /**
	     * Get Instructor By ID
	     * @param id
	     * @return
	     */
	    public College getCollege(int id) {

	 

	        Transaction transaction = null;
	        College coll = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an instructor object
	            coll = session.get(College.class, id);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	        return coll;
	    }
	    
	    /**
	     * Get all Instructors
	     * @return
	     */
	    @SuppressWarnings("unchecked")
	    public List<College> getAllInstructor() {

	 

	        Transaction transaction = null;
	        List<College> listOfColleges = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an instructor object
	            
	            listOfColleges = session.createQuery("from Students").getResultList();
	            
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	        return listOfColleges;
	    }

}
