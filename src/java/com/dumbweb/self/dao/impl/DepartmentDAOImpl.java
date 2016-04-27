/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dumbweb.self.dao.impl;

import com.dumbweb.self.dao.DepartmentDAO;
import com.dumbweb.self.entity.Department;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class DepartmentDAOImpl implements DepartmentDAO {

    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction trans;

    public DepartmentDAOImpl() {

        emf = Persistence.createEntityManagerFactory("JPAselfPU");
        em = emf.createEntityManager();

    }

    @Override
    public void insert(Department d) {
        trans = em.getTransaction();
        if (!trans.isActive()) {
            trans.begin();

        }
        em.persist(d);  // TO INSERT INFO, we use persist() for inserting in JPA
        em.flush();     // while inserting the object may get copied so better flush first;
        trans.commit();
    }

    @Override
    public void update(Department d) {
        trans = em.getTransaction();
        if (!trans.isActive()) {
            trans.begin();

        }
        em.merge(d);  // TO update INFO, we use merge() for updating in JPA
        trans.commit();
    }

    @Override
    public void delete(int id) {
        trans = em.getTransaction();
        if (!trans.isActive()) {
            trans.begin();

        }
        Department d = getById(id);
        if (d != null) {
            em.remove(d);// TO delete INFO, we use remove() for deleting in JPA

        }

        trans.commit();
    }

    @Override
    public List<Department> getAll() {
        return em.createQuery("SELECT d from Department d").getResultList();
    }

    @Override
    public Department getById(int id) {
       return em.find(Department.class, id);  // JAVA Reflections 
    }

}
