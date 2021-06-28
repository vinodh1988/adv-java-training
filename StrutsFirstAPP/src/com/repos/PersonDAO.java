package com.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.entity.Person;

public class PersonDAO {
	 public static EntityManager em=JPARepository.getEntityManager();
     public static List<Person> getPerson(){
    	  Query q =em.createQuery("Select p from Person p");  //JPQL
		  List<Person> l=q.getResultList();
		  return l;
     }
}
