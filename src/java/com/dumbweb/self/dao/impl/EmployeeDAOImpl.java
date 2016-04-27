/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.self.dao.impl;

import com.dumbweb.self.dao.EmployeeDAO;
import com.dumbweb.self.entity.Department;
import com.dumbweb.self.entity.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class EmployeeDAOImpl implements EmployeeDAO{
    
    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction trans;

    public EmployeeDAOImpl() {

        emf = Persistence.createEntityManagerFactory("JPAselfPU");
        em = emf.createEntityManager();

    }

    @Override
    public void insert(Employee e) {
        
        if(!trans.isActive()){
            trans = em.getTransaction();
        }
        
        em.persist(e);
        em.flush();
        trans.commit();
    }

    @Override
    public void update(Employee e) {
        if(!trans.isActive()){
            trans = em.getTransaction();
        }
        
        em.merge(e);
       
        trans.commit();
    }

    @Override
    public void delete(int id) {
        if(!trans.isActive()){
            trans = em.getTransaction();
        }
        Employee e = getById(id);
        em.remove(e);
        em.flush();
        trans.commit();
    }

    @Override
    public List<Employee> getAll() {
        return em.createQuery("SELECT e from Employee e").getResultList();
    }

    @Override
    public Employee getById(int id) {
        return em.find(Employee.class, id);
    }
    
    
}
